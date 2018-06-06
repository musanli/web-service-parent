package com.webservice.server;

import javax.xml.ws.Endpoint;

import com.webservice.server.sei.WeatherImp;

/**
 * Hello world!
 *
 */
public class WebServiceServerMain {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:1234/weater/query", new WeatherImp());
		System.out.println("123");
	}
}
