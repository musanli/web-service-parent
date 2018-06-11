package com.webservice.service.client;

import java.net.MalformedURLException;

import com.webservice.mobile.ArrayOfString;
import com.webservice.mobile.MobileCodeWS;
import com.webservice.mobile.MobileCodeWSSoap;

/**
 * http://www.webxml.com.cn/zh_cn/web_services.aspx?offset=1
 * 
 * @author li_bin
 *
 */
public class MobileClientMain {
	public static void main(String[] args) throws MalformedURLException {
		// 创建微服务视图--寻找server节点
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		// 获取指定port--从server节点中寻找<wsdl:port 节点
		MobileCodeWSSoap port = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		// 拿到port调用指定方法-----根据<wsdl:binding 节点调用指定方法
		String mobileCodeInfo = port.getMobileCodeInfo("15737513789", "");
		ArrayOfString databaseInfo = port.getDatabaseInfo();
		System.out.println(mobileCodeInfo);
		System.out.println(databaseInfo.getString());

	}

}
