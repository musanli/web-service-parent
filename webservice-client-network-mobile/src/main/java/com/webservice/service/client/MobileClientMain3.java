package com.webservice.service.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import com.webservice.mobile.ArrayOfString;
import com.webservice.mobile.MobileCodeWS;
import com.webservice.mobile.MobileCodeWSSoap;

/**
 * http://www.webxml.com.cn/zh_cn/web_services.aspx?offset=1
 * 第三种调用方式
 * @author li_bin
 *
 */
public class MobileClientMain3 {
	public static void main(String[] args) throws IOException {
		/*		创建url		*/
		URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
		URLConnection openConnection = url.openConnection();
		HttpURLConnection http = (HttpURLConnection) openConnection;
		
		http.setDoInput(true);
		http.setDoOutput(true);
		http.setRequestProperty("content-type", "text/xml;charset=utf-8");
		http.setRequestMethod("POST");
		
		OutputStream os = http.getOutputStream();
		os.write(getXML().getBytes());
		int responseCode = http.getResponseCode();
		if(responseCode == 200) {
			byte[] b = new byte[1024 * 10];
			InputStream is = http.getInputStream();
			int len = is.read(b);
			System.out.println(len);
			System.out.println(new String(b,0,len));
		}
	}
	
	public static String getXML() {
		String s = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\"><mobileCode>18888888888</mobileCode><userID></userID></getMobileCodeInfo></soap:Body></soap:Envelope>";
		String str = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <soap:Body>\r\n" + 
				"    <getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">\r\n" + 
				"      <mobileCode>18888888888</mobileCode>\r\n" + 
				"      <userID></userID>\r\n" + 
				"    </getMobileCodeInfo>\r\n" + 
				"  </soap:Body>\r\n" + 
				"</soap:Envelope>";
		
		return str;
	}
}
