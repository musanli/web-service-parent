package com.webservice.service.client;

import com.webservice.server.sei.WeatherImp;
import com.webservice.server.sei.WeatherImpService;

/**
 * @author li_bin 
 * wsimport是jdk自带的命令（dos命令），Jdk1.6.0_13以后的版本支持jaxws2.1 
 * 1、wsimport –s . wsdl地址（例如：http://127.0.0.1:1234/weather?wsdl）
 * 2、
 *
 */
public class WebServiceClientMain {

	public static void main(String[] args) {
		/* 创建服务视图 */
		WeatherImpService weatherImpService = new WeatherImpService();
		/* 通过服务视图得到服务端点 */
		WeatherImp port = weatherImpService.getPort(WeatherImp.class);
		/* 调用webservice服务方法 */
		String tomorrowWeatherQuery = port.tomorrowWeatherQuery("北京");
		/*	输出结果	*/
		System.out.println(tomorrowWeatherQuery);
	}
}
