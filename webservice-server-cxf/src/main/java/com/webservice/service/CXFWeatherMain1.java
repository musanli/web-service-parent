package com.webservice.service;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.webservice.service.sei.WeatherSeiImpl1;
import com.webservice.service.sei.inter.WeatherSeiInter1;

/**
 * 发布soap1.1版本.
 * @author li_bin
 *
 */
public class CXFWeatherMain1 {
	public static void main(String[] args) {
		/*		创建cxfJaxWsServerFactoryBean 用于发布服务		*/
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		/*		设置SEI接口	--接口上必须有注解webservice	*/
		jaxWsServerFactoryBean.setServiceClass(WeatherSeiInter1.class);
		/*		设置SEI实现类		*/
		jaxWsServerFactoryBean.setServiceBean(new WeatherSeiImpl1());
		/*		设置服务地址		*/
		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12345/weather");
		/*		添加请求拦截器		*/
		System.out.println("请求数据 ... ... ...");
		jaxWsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
		System.out.println("返回数据 ... ... ...");
		jaxWsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		/*		开启服务		*/
		jaxWsServerFactoryBean.create();
	}
}
