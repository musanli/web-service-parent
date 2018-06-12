package com.webservice.service;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.webservice.service.sei.WeatherSeiImpl2;
import com.webservice.service.sei.inter.WeatherSeiInter2;

/**
 * 发布soap1.1版本.
 * @author li_bin
 *
 */
public class CXFWeatherMain2 {
	public static void main(String[] args) {
//		/*		创建cxfJaxWsServerFactoryBean 用于发布服务		*/
//		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
//		/*		设置SEI接口	--接口上必须有注解webservice	*/
//		jaxWsServerFactoryBean.setServiceClass(WeatherSeiInter2.class);
//		/*		设置SEI实现类		*/
//		jaxWsServerFactoryBean.setServiceBean(new WeatherSeiImpl2());
//		/*		设置服务地址		*/
//		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12346/weather");
//		/*		开启服务		*/
//		jaxWsServerFactoryBean.create();
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
	}
}
