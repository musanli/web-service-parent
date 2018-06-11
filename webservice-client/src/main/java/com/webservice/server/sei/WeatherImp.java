
package com.webservice.server.sei;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "WeatherImp", targetNamespace = "http://sei.server.webservice.com/")
@XmlSeeAlso({ ObjectFactory.class })
public interface WeatherImp {

	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "tomorrowWeatherQuery", targetNamespace = "http://sei.server.webservice.com/", className = "com.webservice.server.sei.TomorrowWeatherQuery")
	@ResponseWrapper(localName = "tomorrowWeatherQueryResponse", targetNamespace = "http://sei.server.webservice.com/", className = "com.webservice.server.sei.TomorrowWeatherQueryResponse")
	@Action(input = "http://sei.server.webservice.com/WeatherImp/tomorrowWeatherQueryRequest", output = "http://sei.server.webservice.com/WeatherImp/tomorrowWeatherQueryResponse")
	public String tomorrowWeatherQuery(@WebParam(name = "arg0", targetNamespace = "") String arg0);

}
