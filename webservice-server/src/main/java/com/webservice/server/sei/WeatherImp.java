package com.webservice.server.sei;
import javax.jws.WebService;
import com.webservice.server.sei.inter.WeatherInter;
@WebService
public class WeatherImp implements WeatherInter {

	public String tomorrowWeatherQuery(String address) {
		System.out.println("地址：" + address);
		return "扬沙天气";
	}

}
