package com.webservice.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.webservice.service.weather2.WeatherSeiInter2;

public class weather1Main {

	public static void main(String[] args) {
		/* 获取 JaxWsProxyFactoryBean */
		JaxWsProxyFactoryBean JaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		/* 设置服务地址 */
		JaxWsProxyFactoryBean.setAddress("http://127.0.0.1:12345/weather?wsdl");
//		/* 设置服务接口 */
//		JaxWsProxyFactoryBean.setServiceClass(WeatherSeiInter2.class);
		/* 获取服务接口实例 */
		WeatherSeiInter2 service = JaxWsProxyFactoryBean.create(WeatherSeiInter2.class);
		/* 调用服务 */
		String queryWeather = service.queryWeather("123");
		/* 打印输出 */
		System.out.println(queryWeather);
	}
	
	@Test
	public void t1() throws IOException {
		/*		
		 * 1、创建url
		 * 		*/
		URL url = new URL("http://127.0.0.1:12345/weather?wsdl");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setDoInput(true);
		http.setDoOutput(true);
		http.setRequestProperty("content-type", "text/xml;charset=utf-8");
		http.setRequestMethod("POST");
		http.getOutputStream().write(getXML().getBytes());
		int responseCode = http.getResponseCode();
		if(responseCode == 200) {
			byte[] b = new byte[1024 * 10];
			InputStream is = http.getInputStream();
			int len = is.read(b);
			System.out.println(len);
			System.out.println(new String(b,0,len));
		}
	}
	@Test
	public  void testPost() throws Exception {
		String url = "http://127.0.0.1:12345/weather?wsdl";
		String params = getXML() ;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(url);
		StringEntity entity = new StringEntity(params,"utf-8");
		entity.setContentType("text/xml; charset=UTF-8");
		entity.setContentEncoding("UTF-8");
		httppost.setEntity(entity); 
		HttpResponse response = httpclient.execute(httppost);
		HttpEntity entity1 = response.getEntity();
		String html = EntityUtils.toString(entity1,"UTF-8");              
		httpclient.close();
		System.out.println(html);
	}
	
	private String getXML() {
		return "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:queryWeather xmlns:ns2=\"http://inter.sei.service.webservice.com/\"><arg0>123</arg0></ns2:queryWeather></soap:Body></soap:Envelope>";
	}

}
