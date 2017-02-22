package com.api.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;
import com.api.exception.HttpClientException;

/**
 * HttpClient工具类
 * 
 * @author HCK
 *
 */
public class HttpClientUtils {

	private static RequestConfig requestConfig = 
			RequestConfig.custom()
			.setSocketTimeout(60000)
			.setConnectTimeout(60000)
			.setConnectionRequestTimeout(60000).build();

	/**
	 * 发送get请求
	 * 
	 * @param httpUrl
	 * @return
	 * @throws HttpClientException
	 */
	public RespJson sendHttpGet(String httpUrl) throws HttpClientException {
		HttpGet httpGet = new HttpGet(httpUrl);// 创建get请求
		return sendHttpGet(httpGet);
	}

	/**
	 * 发送post请求
	 * 
	 * @param httpUrl
	 * @param jsonParam
	 * @return
	 * @throws HttpClientException
	 */
	public static RespJson sendHttpPost(String httpUrl, String jsonParam) throws HttpClientException {
		HttpPost httpPost = new HttpPost(httpUrl);// 创建httpPost
		if (jsonParam != null) {
			// 设置参数
			StringEntity stringEntity = new StringEntity(jsonParam, "UTF-8");
			stringEntity.setContentType("application/json");
			httpPost.setEntity(stringEntity);
		}
		return sendHttpPost(httpPost);
	}

	/**
	 * 发送post请求
	 * 
	 * @param httpGet
	 * @return
	 * @throws HttpClientException
	 */
	private static RespJson sendHttpGet(HttpGet httpGet) throws HttpClientException {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			// 创建默认的httpClient实例.
			httpClient = HttpClients.createDefault();
			httpGet.setConfig(requestConfig);
			// 执行请求
			response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			String responseContent = EntityUtils.toString(entity, "UTF-8");
			JSONObject jsonObject = JSONObject.parseObject(responseContent);
			return convertToRespJson(jsonObject);
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
	 */
	private static RespJson sendHttpPost(HttpPost httpPost) throws HttpClientException {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			// 创建默认的httpClient实例.
			httpClient = HttpClients.createDefault();
			httpPost.setConfig(requestConfig);
			// 执行请求
			response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			String responseContent = EntityUtils.toString(entity, "UTF-8");
			JSONObject jsonObject = JSONObject.parseObject(responseContent);
			return convertToRespJson(jsonObject);

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

	private static RespJson convertToRespJson(JSONObject jsonObject) {
		if (jsonObject.getBooleanValue("result")) {
			return RespJsonFactory.buildSuccess();
		} else {
			String msg = jsonObject.getString("msg");
			return RespJsonFactory.buildFailure(msg);
		}
	}

	public static void main(String[] args) throws HttpClientException {

		JSONObject json = new JSONObject();
		json.put("username", "admin");
		json.put("password", "000000");
		System.out.println(org.apache.http.HttpStatus.SC_CREATED);
		sendHttpPost("http://192.168.100.136:8080/UPM_API/test/getData", null);
	}
}
