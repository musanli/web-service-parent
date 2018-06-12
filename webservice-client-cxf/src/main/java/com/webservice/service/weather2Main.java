package com.webservice.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.webservice.service.weather2.WeatherSeiInter2;
import com.webservice.service.weather2.WeatherSeiInter2Service;

public class weather2Main {

	public static void main(String[] args) {
		/* 获取 JaxWsProxyFactoryBean */
		JaxWsProxyFactoryBean JaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		/* 设置服务地址 */
		JaxWsProxyFactoryBean.setAddress("http://127.0.0.1:12346/weather?wsdl");
//		/* 设置服务接口 */
//		JaxWsProxyFactoryBean.setServiceClass(WeatherSeiInter2.class);
		/* 获取服务接口实例 */
		WeatherSeiInter2 service = JaxWsProxyFactoryBean.create(WeatherSeiInter2.class);
		/* 调用服务 */
		String queryWeather = service.queryWeather("123");
		/* 打印输出 */
		System.out.println(queryWeather);
	}

}
