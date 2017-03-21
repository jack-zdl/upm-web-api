package com.api.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.exception.HttpClientException;
import com.api.exception.HttpConnectionException;

/**
 * HttpClient工具类
 * 
 * @author HCK
 *
 */
public class HttpClientUtils {
	
	public static final String METHOD_GET = "GET";
	public static final String METHOD_POST = "POST";
	public static final String METHOD_PUT = "PUT";
	public static final String METHOD_DELETE = "DELETE";

	private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000)
			.setConnectionRequestTimeout(60000).build();

	/**
	 * 发送get请求
	 * 
	 * @param httpUrl
	 * @return
	 * @throws HttpClientException
	 */
	public static RespJson sendHttpGet(String httpUrl) throws HttpConnectionException, HttpClientException {
		System.out.println("请求地址：" + httpUrl);
		HttpGet httpGet = new HttpGet(httpUrl);// 创建get请求
		return sendHttpGet(httpGet);
	}

	/**
	 * 发送post创建请求
	 * 
	 * @param httpUrl
	 * @param jsonParam
	 * @return
	 * @throws HttpClientException
	 */
	public static RespJson sendHttpPost(String httpUrl, String jsonParam)
			throws HttpConnectionException, HttpClientException {
		HttpPost httpPost = new HttpPost(httpUrl);// 创建httpPost
		System.out.println("请求地址：" + httpUrl);
		System.out.println("请求参数：" + jsonParam);
		if (jsonParam != null) {
			// 设置参数
			StringEntity stringEntity = new StringEntity(jsonParam, "UTF-8");
			stringEntity.setContentType("application/json");
			httpPost.setEntity(stringEntity);
		}
		return sendHttpPost(httpPost);
	}
	
	/**
	 * 发送put请求
	 * 
	 * @param httpUrl
	 * @param jsonParam
	 * @return
	 * @throws HttpClientException
	 */
	public static RespJson sendHttpPut(String httpUrl, String jsonParam)
			throws HttpConnectionException, HttpClientException {
		HttpPut httpPut = new HttpPut(httpUrl);// 创建httpPost
		System.out.println("请求地址：" + httpUrl);
		System.out.println("请求参数：" + jsonParam);
		if (jsonParam != null) {
			// 设置参数
			StringEntity stringEntity = new StringEntity(jsonParam, "UTF-8");
			stringEntity.setContentType("application/json");
			httpPut.setEntity(stringEntity);
		}
		return sendHttpPut(httpPut);
	}
	
	/**
	 * 发送delete请求
	 * 
	 * @param httpUrl
	 * @return
	 * @throws HttpClientException
	 */
	public static RespJson sendHttpDelete(String httpUrl) throws HttpConnectionException, HttpClientException {
		System.out.println("请求地址：" + httpUrl);
		HttpDelete httpDelete = new HttpDelete(httpUrl);// 创建delete请求
		return sendHttpDelete(httpDelete);
	}

	/**
	 * 发送get请求
	 * 
	 * @param httpGet
	 * @return
	 * @throws HttpClientException
	 */
	private static RespJson sendHttpGet(HttpGet httpGet) throws HttpConnectionException, HttpClientException {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			// 创建默认的httpClient实例.
			httpClient = HttpClients.createDefault();
			httpGet.setConfig(requestConfig);
			// 执行请求
			response = httpClient.execute(httpGet);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == HttpStatus.SC_OK) {
				HttpEntity entity = response.getEntity();
				if (!entity.getContentType().getValue().equals("application/json")) {
					return RespJsonFactory.buildSuccess();
				} else {
					String responseContent = EntityUtils.toString(entity, "UTF-8");
					return convertToRespJson(responseContent);
				}
//				String responseContent = EntityUtils.toString(entity, "UTF-8");
//				return convertToRespJson(responseContent);
			}
			return RespJsonFactory.buildFailure("调用接口异常[Status:" + statusCode +"]");
		} catch (HttpHostConnectException e) {
			throw new HttpConnectionException(e.getMessage());
		} catch (Exception e) {
			throw new HttpClientException(e.getMessage());
		} finally {
			try {
				// 关闭连接,释放资源
				if (response != null) {
					response.close();
				}
				if (httpClient != null) {
					httpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 发送post请求
	 * 
	 * @param httpPost
	 * @return
	 * @throws HttpClientException
	 * @throws HttpConnectionException
	 */
	private static RespJson sendHttpPost(HttpPost httpPost) throws HttpConnectionException, HttpClientException {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			// 创建默认的httpClient实例.
			httpClient = HttpClients.createDefault();
			httpPost.setConfig(requestConfig);
			// 执行请求
			response = httpClient.execute(httpPost);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != HttpStatus.SC_CREATED) {
				return RespJsonFactory.buildFailure("调用接口异常[Status:" + statusCode +"]");
			}
			HttpEntity entity = response.getEntity();
			String responseContent = EntityUtils.toString(entity, "UTF-8");
			return convertToRespJson(responseContent);

		} catch (HttpHostConnectException e) {
			throw new HttpConnectionException(e.getMessage());
		} catch (Exception e) {
			throw new HttpClientException(e.getMessage());
		} finally {
			try {
				// 关闭连接,释放资源
				if (response != null) {
					response.close();
				}
				if (httpClient != null) {
					httpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 发送post请求
	 * 注：标准是发送put请求，方法名称也是发送put请求的意思。
	 *    但由于第三方api的创建和更新操作都是post请求
	 *    所以虽然方法名称是发送put请求的意思但方法体仍是发送
	 *    post请求，返回200，表示请求成功
	 * @param httpPost
	 * @return
	 * @throws HttpClientException
	 * @throws HttpConnectionException
	 */
	private static RespJson sendHttpPut(HttpPut httpPut) throws HttpConnectionException, HttpClientException {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			// 创建默认的httpClient实例.
			httpClient = HttpClients.createDefault();
			httpPut.setConfig(requestConfig);
			// 执行请求
			response = httpClient.execute(httpPut);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != HttpStatus.SC_OK) {
				return RespJsonFactory.buildFailure("调用接口异常[Status:" + statusCode +"]");
			}
			HttpEntity entity = response.getEntity();
			String responseContent = EntityUtils.toString(entity, "UTF-8");
			return convertToRespJson(responseContent);

		} catch (HttpHostConnectException e) {
			throw new HttpConnectionException(e.getMessage());
		} catch (Exception e) {
			throw new HttpClientException(e.getMessage());
		} finally {
			try {
				// 关闭连接,释放资源
				if (response != null) {
					response.close();
				}
				if (httpClient != null) {
					httpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 发送delete请求
	 * 
	 * @param httpDelete
	 * @return
	 * @throws HttpClientException
	 */
	private static RespJson sendHttpDelete(HttpDelete httpDelete) throws HttpConnectionException, HttpClientException {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			// 创建默认的httpClient实例.
			httpClient = HttpClients.createDefault();
			httpDelete.setConfig(requestConfig);
			// 执行请求
			response = httpClient.execute(httpDelete);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == HttpStatus.SC_NO_CONTENT) {
				return RespJsonFactory.buildSuccess();
			}
			return RespJsonFactory.buildFailure("调用接口异常[Status:" + statusCode +"]");
		} catch (HttpHostConnectException e) {
			throw new HttpConnectionException(e.getMessage());
		} catch (Exception e) {
			throw new HttpClientException(e.getMessage());
		} finally {
			try {
				// 关闭连接,释放资源
				if (response != null) {
					response.close();
				}
				if (httpClient != null) {
					httpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	private static RespJson convertToRespJson(String responseContent) {
		if (responseContent.startsWith("{")) {
			return RespJsonFactory.buildSuccess(JSONObject.parseObject(responseContent));
		} else if (responseContent.startsWith("[")) {
			return RespJsonFactory.buildSuccess(JSONArray.parseArray(responseContent));
		} else {
			return RespJsonFactory.buildSuccess();
		}
	}
}
