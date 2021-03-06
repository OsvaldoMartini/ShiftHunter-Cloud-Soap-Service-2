//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 10:56:31 AM GMT+01:00 
//


package ch.corner.service.conveniencecard.configuration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ch.corner.service.conveniencecard.common.BasicRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.corner.service.conveniencecard.configuration package. 
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

    private final static QName _GetNationListResponse_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getNationListResponse");
    private final static QName _GetDecodedPF20Response_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getDecodedPF20Response");
    private final static QName _GetNapAndCityListResponse_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getNapAndCityListResponse");
    private final static QName _GetNationListRequest_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getNationListRequest");
    private final static QName _GetParamInfoResponse_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getParamInfoResponse");
    private final static QName _GetNapAndCityListRequest_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getNapAndCityListRequest");
    private final static QName _GetDecodedPF20Request_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getDecodedPF20Request");
    private final static QName _GetParamInfoRequest_QNAME = new QName("http://configuration.conveniencecard.service.corner.ch", "getParamInfoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.corner.service.conveniencecard.configuration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNapAndCityListResponse }
     * 
     */
    public GetNapAndCityListResponse createGetNapAndCityListResponse() {
        return new GetNapAndCityListResponse();
    }

    /**
     * Create an instance of {@link GetParamInfoResponse }
     * 
     */
    public GetParamInfoResponse createGetParamInfoResponse() {
        return new GetParamInfoResponse();
    }

    /**
     * Create an instance of {@link GetDecodedPF20 }
     * 
     */
    public GetDecodedPF20 createGetDecodedPF20() {
        return new GetDecodedPF20();
    }

    /**
     * Create an instance of {@link GetNationListResponse }
     * 
     */
    public GetNationListResponse createGetNationListResponse() {
        return new GetNationListResponse();
    }

    /**
     * Create an instance of {@link GetDecodedPF20Response }
     * 
     */
    public GetDecodedPF20Response createGetDecodedPF20Response() {
        return new GetDecodedPF20Response();
    }

    /**
     * Create an instance of {@link Nation }
     * 
     */
    public Nation createNation() {
        return new Nation();
    }

    /**
     * Create an instance of {@link TListNapAndCity }
     * 
     */
    public TListNapAndCity createTListNapAndCity() {
        return new TListNapAndCity();
    }

    /**
     * Create an instance of {@link ParamInfo }
     * 
     */
    public ParamInfo createParamInfo() {
        return new ParamInfo();
    }

    /**
     * Create an instance of {@link Pf20Element }
     * 
     */
    public Pf20Element createPf20Element() {
        return new Pf20Element();
    }

    /**
     * Create an instance of {@link NapAndCity }
     * 
     */
    public NapAndCity createNapAndCity() {
        return new NapAndCity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNationListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getNationListResponse")
    public JAXBElement<GetNationListResponse> createGetNationListResponse(GetNationListResponse value) {
        return new JAXBElement<GetNationListResponse>(_GetNationListResponse_QNAME, GetNationListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDecodedPF20Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getDecodedPF20Response")
    public JAXBElement<GetDecodedPF20Response> createGetDecodedPF20Response(GetDecodedPF20Response value) {
        return new JAXBElement<GetDecodedPF20Response>(_GetDecodedPF20Response_QNAME, GetDecodedPF20Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNapAndCityListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getNapAndCityListResponse")
    public JAXBElement<GetNapAndCityListResponse> createGetNapAndCityListResponse(GetNapAndCityListResponse value) {
        return new JAXBElement<GetNapAndCityListResponse>(_GetNapAndCityListResponse_QNAME, GetNapAndCityListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getNationListRequest")
    public JAXBElement<BasicRequest> createGetNationListRequest(BasicRequest value) {
        return new JAXBElement<BasicRequest>(_GetNationListRequest_QNAME, BasicRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParamInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getParamInfoResponse")
    public JAXBElement<GetParamInfoResponse> createGetParamInfoResponse(GetParamInfoResponse value) {
        return new JAXBElement<GetParamInfoResponse>(_GetParamInfoResponse_QNAME, GetParamInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getNapAndCityListRequest")
    public JAXBElement<BasicRequest> createGetNapAndCityListRequest(BasicRequest value) {
        return new JAXBElement<BasicRequest>(_GetNapAndCityListRequest_QNAME, BasicRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDecodedPF20 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getDecodedPF20Request")
    public JAXBElement<GetDecodedPF20> createGetDecodedPF20Request(GetDecodedPF20 value) {
        return new JAXBElement<GetDecodedPF20>(_GetDecodedPF20Request_QNAME, GetDecodedPF20 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.conveniencecard.service.corner.ch", name = "getParamInfoRequest")
    public JAXBElement<BasicRequest> createGetParamInfoRequest(BasicRequest value) {
        return new JAXBElement<BasicRequest>(_GetParamInfoRequest_QNAME, BasicRequest.class, null, value);
    }

}
