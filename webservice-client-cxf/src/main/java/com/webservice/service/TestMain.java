package com.webservice.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestMain {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		String url = "http://127.0.0.1:12345/weather?wsdl";
		String params = getXML();
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(url);
		StringEntity entity = new StringEntity(params, "utf-8");
		entity.setContentType("text/xml; charset=UTF-8");
		entity.setContentEncoding("UTF-8");
		httppost.setEntity(entity);
		HttpResponse response = httpclient.execute(httppost);
		HttpEntity entity1 = response.getEntity();
		String html = EntityUtils.toString(entity1, "UTF-8");
		httpclient.close();
		System.out.println(html);
	}
	
	
	private static String getXML() {
		return "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:queryWeather xmlns:ns2=\"http://inter.sei.service.webservice.com/\"><arg0>123</arg0></ns2:queryWeather></soap:Body></soap:Envelope>";
	}
}
