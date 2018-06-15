package com.webservice.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.webservice.service.weather.ArrayOfString;
import com.webservice.service.weather.WeatherWSSoap;

/**
 * 通过自己创建Service
 * 
 * @author li_bin
 *
 */
public class WeatherClientMain {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("file:/D:/Program Files (x86)/spring-tool-suite-3.9.2/workspace01-sts-3.9.2.RELEASE/web-service-parent/webservice-client-network-weather/src/main/java/com/webservice/service/client/WeatherWS.xml");
//		URL url = new URL("http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl");
		/*		url：			wsdl地址。
		 * 		命名空间 ：			targetNamespace="http://WebXml.com.cn/">。
		 * 		访问服务节点名称：	<wsdl:service name="WeatherWS">。
		 */
		QName serviceName = new QName("http://WebXml.com.cn/", "WeatherWS");
		Service service = Service.create(url, serviceName);
		WeatherWSSoap port = service.getPort(WeatherWSSoap.class);
		ArrayOfString regionProvince = port.getRegionProvince();
		
		System.out.println(port.getWeather("北京",null).getString());
		List<String> list = regionProvince.getString();
		for (String item : list) {
//			String a = null ;
//			a = item.substring(0 , item.indexOf(","));
//			System.out.print(a + "\t");
//			ArrayOfString weather = port.getWeather(a,null);
//			System.out.println(item + ":" +weather.getString());
		}
	}
}
