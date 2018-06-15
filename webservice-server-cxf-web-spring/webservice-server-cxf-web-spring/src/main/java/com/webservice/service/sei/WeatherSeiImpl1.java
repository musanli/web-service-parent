package com.webservice.service.sei;

import java.sql.Date;
import java.util.Calendar;

import com.webservice.service.sei.inter.WeatherSeiInter1;
//@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherSeiImpl1 implements WeatherSeiInter1 {

	public String queryWeather(String city) {

		System.out.println("天朗气清：" + new Date(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH).toString());
		return new Date(System.currentTimeMillis()).toString();
	}

}
