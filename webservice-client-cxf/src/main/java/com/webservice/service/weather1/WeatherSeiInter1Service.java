package com.webservice.service.weather1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2018-06-13T09:33:41.316+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "WeatherSeiInter1Service", 
                  wsdlLocation = "http://127.0.0.1:12345/weather?wsdl",
                  targetNamespace = "http://inter.sei.service.webservice.com/") 
public class WeatherSeiInter1Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://inter.sei.service.webservice.com/", "WeatherSeiInter1Service");
    public final static QName WeatherSeiInter1Port = new QName("http://inter.sei.service.webservice.com/", "WeatherSeiInter1Port");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:12345/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherSeiInter1Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:12345/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherSeiInter1Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherSeiInter1Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherSeiInter1Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherSeiInter1Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherSeiInter1Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherSeiInter1Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WeatherSeiInter1
     */
    @WebEndpoint(name = "WeatherSeiInter1Port")
    public WeatherSeiInter1 getWeatherSeiInter1Port() {
        return super.getPort(WeatherSeiInter1Port, WeatherSeiInter1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherSeiInter1
     */
    @WebEndpoint(name = "WeatherSeiInter1Port")
    public WeatherSeiInter1 getWeatherSeiInter1Port(WebServiceFeature... features) {
        return super.getPort(WeatherSeiInter1Port, WeatherSeiInter1.class, features);
    }

}
