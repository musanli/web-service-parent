
package com.webservice.server.sei;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.server.sei package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TomorrowWeatherQueryResponse_QNAME = new QName("http://sei.server.webservice.com/", "tomorrowWeatherQueryResponse");
    private final static QName _TomorrowWeatherQuery_QNAME = new QName("http://sei.server.webservice.com/", "tomorrowWeatherQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.server.sei
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TomorrowWeatherQuery }
     * 
     */
    public TomorrowWeatherQuery createTomorrowWeatherQuery() {
        return new TomorrowWeatherQuery();
    }

    /**
     * Create an instance of {@link TomorrowWeatherQueryResponse }
     * 
     */
    public TomorrowWeatherQueryResponse createTomorrowWeatherQueryResponse() {
        return new TomorrowWeatherQueryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TomorrowWeatherQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.server.webservice.com/", name = "tomorrowWeatherQueryResponse")
    public JAXBElement<TomorrowWeatherQueryResponse> createTomorrowWeatherQueryResponse(TomorrowWeatherQueryResponse value) {
        return new JAXBElement<TomorrowWeatherQueryResponse>(_TomorrowWeatherQueryResponse_QNAME, TomorrowWeatherQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TomorrowWeatherQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.server.webservice.com/", name = "tomorrowWeatherQuery")
    public JAXBElement<TomorrowWeatherQuery> createTomorrowWeatherQuery(TomorrowWeatherQuery value) {
        return new JAXBElement<TomorrowWeatherQuery>(_TomorrowWeatherQuery_QNAME, TomorrowWeatherQuery.class, null, value);
    }

}
