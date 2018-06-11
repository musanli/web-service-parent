package com.webservice.service.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.webservice.server.sei.WeatherImp;

/**
 * 天气查询客户端代码
 */
public class WebServiceClientMain2 {

	public static void main(String[] args) throws MalformedURLException {
		/*       定义url,参数为wsdl地址         */
		URL url = new URL("http://127.0.0.1:4321/weater/query?wsdl");
//		URL url = new URL("http://127.0.0.1:1234/weater/query?wsdl");
		/*       定义qname;第一个参数为命名空间，第二个参数为wsdl里面的服务名称         */
		QName qname = new QName("http://sei.server.webservice.com/","WeatherImpService");
		/*       创建服务视图         */
		Service service = Service.create(url, qname);		/*                */
		/*       通过服务视图得到服务端点         */
		WeatherImp weatherImp =service.getPort(WeatherImp.class);
		/*       调用webservice         */
		String tomorrowWeatherQuery = weatherImp.tomorrowWeatherQuery("南京");
		/*        输出结果        */
		System.out.println(tomorrowWeatherQuery);
		/*                */
	}
}
