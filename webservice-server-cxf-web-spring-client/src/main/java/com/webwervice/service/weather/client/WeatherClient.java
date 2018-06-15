package com.webwervice.service.weather.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webwervice.service.weather.ArrayOfString;
import com.webwervice.service.weather.WeatherWSSoap;

/**
 * »‘”–Œ Ã‚…–Œ¥–ﬁ∏¥°£
 * @author li_bin
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		ApplicationContext apllication = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		WeatherWSSoap weather = apllication.getBean("weatherWSSoap",WeatherWSSoap.class);
		ArrayOfString weainfo = weather.getSupportCityString("Ê≤≥Âçó");
		System.out.println(weainfo);
	}
}
