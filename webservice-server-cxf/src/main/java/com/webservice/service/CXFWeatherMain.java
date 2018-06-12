package com.webservice.service;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.webservice.service.sei.inter.WeatherSeiImpl;
import com.webservice.service.sei.inter.WeatherSeiInter;

public class CXFWeatherMain {
	public static void main(String[] args) {
		/*		创建cxfJaxWsServerFactoryBean 用于发布服务		*/
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		/*		设置SEI接口	--接口上必须有注解webservice	*/
		jaxWsServerFactoryBean.setServiceClass(WeatherSeiInter.class);
		/*		设置SEI实现类		*/
		jaxWsServerFactoryBean.setServiceBean(new WeatherSeiImpl());
		/*		设置服务地址		*/
		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12345/weather");
		/*		开启服务		*/
		jaxWsServerFactoryBean.create();
	}
}
