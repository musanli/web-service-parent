package com.webservice.service.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 将GBK文本转换为UTF-8文本。文件大小不可超过1M
 * 
 * @author li_bin
 *
 */
public class FileTranscoding {

	public static void main(String[] args) throws IOException {
		Map<String, Boolean> gbkToUTF8ForDir = GBKToUTF8ForDir(
				"D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\workspace01-sts-3.9.2.RELEASE\\web-service-parent\\webservice-client-network-weather\\src\\main\\java\\com\\webservice\\service\\weather");
		System.out.println(gbkToUTF8ForDir);
	}

	public static Map<String, Boolean> GBKToUTF8ForDir(String dirPath) throws IOException {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		File fileDir = new File(dirPath);
		if (fileDir.isDirectory()) {
			File[] listFiles = fileDir.listFiles();
			for (File file : listFiles) {
				Map<String, Boolean> itemMap = GBKToUTF8ForDir(file.getPath());
				map.putAll(itemMap);
			}
		} else if (fileDir.isFile()) {
			map.put(dirPath, GBKToUTF8ForFile(fileDir));
		}
		return map;
	}

	public static boolean GBKToUTF8ForFile(File file) throws IOException {
		boolean flag = false;
		FileInputStream fis = new FileInputStream(file);
		int len = -1;
		byte[] b = new byte[1024 * 1024];
		len = fis.read(b);
		String text = new String(b, 0, len, "GBK");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(text.getBytes("UTF-8"));
		fos.close();
		fis.close();
		return flag;
	}
}
