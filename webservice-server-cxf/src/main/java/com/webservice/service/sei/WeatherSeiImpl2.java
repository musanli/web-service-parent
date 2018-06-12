package com.webservice.service.sei;

import java.sql.Date;
import java.util.Calendar;

import com.webservice.service.sei.inter.WeatherSeiInter2;
public class WeatherSeiImpl2 implements WeatherSeiInter2 {

	public String queryWeather(String city) {

		System.out.println("天朗气清：" + new Date(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH).toString());
		return new Date(System.currentTimeMillis()).toString();
	}

}
