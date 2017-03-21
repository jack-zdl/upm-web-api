package com.api.util;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	/**
	 * 
	 * @param dirPath
	 *            文件目录路径
	 * @param suffix
	 *            文件后缀名
	 * @return
	 */
	public static List<File> getFileList(String dirPath, String suffix) {
		List<File> fileList = new ArrayList<File>();
		File file = new File(dirPath);
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] fileArr = file.listFiles();
				for (File f : fileArr) {
					if (f.isFile()) {
						String fileName = f.getName();
						if (fileName.substring(fileName.lastIndexOf(".")).equals(suffix)) {
							fileList.add(f);
						}
					}
				}
			}
		}
		return fileList;
	}
	
	public static void main(String[] args){
		DecimalFormat df = new DecimalFormat("#,###");
		double d = 797979797979l / 1024.0;
		System.out.println(df.format(d));
		//getFileList("c:\\temp",".png");
	}
}
