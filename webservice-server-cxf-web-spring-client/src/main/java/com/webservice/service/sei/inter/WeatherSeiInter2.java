package com.webservice.service.sei.inter;

import javax.jws.WebService;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.ws.BindingType;


/**
 * sei接口 SOAP 1.2.
 * @author li_bin
 *
 */
@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)//soap1.2 添加的注解
public interface WeatherSeiInter2 {

	public String queryWeather(String city);
}
