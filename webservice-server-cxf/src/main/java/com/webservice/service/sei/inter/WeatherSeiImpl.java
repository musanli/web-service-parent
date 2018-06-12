package com.webservice.service.sei.inter;

import java.sql.Date;
import java.util.Calendar;

import javax.xml.ws.BindingType;
//@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherSeiImpl implements WeatherSeiInter {

	public String queryWeather(String city) {

		System.out.println("天朗气清：" + new Date(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH).toString());
		return new Date(System.currentTimeMillis()).toString();
	}

}
