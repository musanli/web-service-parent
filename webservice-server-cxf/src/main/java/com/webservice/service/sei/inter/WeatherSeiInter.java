package com.webservice.service.sei.inter;

import javax.jws.WebService;

/**
 * sei接口.
 * @author li_bin
 *
 */
@WebService
public interface WeatherSeiInter {

	public String queryWeather(String city);
}
