package com.webservice.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import com.webservice.mobile.ArrayOfString;
import com.webservice.mobile.MobileCodeWS;
import com.webservice.mobile.MobileCodeWSSoap;

/**
 * http://www.webxml.com.cn/zh_cn/web_services.aspx?offset=1
 * 第二种调用方式
 * @author li_bin
 *
 */
public class MobileClientMain2 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		QName serviceName = new QName("http://WebXml.com.cn/", "MobileCodeWS");
		Service service = Service.create(url, serviceName);
		MobileCodeWSSoap port = service.getPort(MobileCodeWSSoap.class);
		// 拿到port调用指定方法-----根据<wsdl:binding 节点调用指定方法
		String mobileCodeInfo = port.getMobileCodeInfo("15737513789", "");
		ArrayOfString databaseInfo = port.getDatabaseInfo();
		System.out.println(mobileCodeInfo);
		List<String> list = databaseInfo.getString();
		for (String string : list) {
			System.out.println(string);
		}
	}
}
