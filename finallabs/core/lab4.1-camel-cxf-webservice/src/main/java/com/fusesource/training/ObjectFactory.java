
package com.fusesource.training;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fusesource.training package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _GetCustomerByName_QNAME = new QName("http://training.fusesource.com/", "getCustomerByName");
    private final static QName _GetCustomerByNameResponse_QNAME = new QName("http://training.fusesource.com/", "getCustomerByNameResponse");
    private final static QName _GetAllCustomers_QNAME = new QName("http://training.fusesource.com/", "getAllCustomers");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://training.fusesource.com/", "getAllCustomersResponse");
    private final static QName _SaveCustomer_QNAME = new QName("http://training.fusesource.com/", "saveCustomer");
    private final static QName _SaveCustomerResponse_QNAME = new QName("http://training.fusesource.com/", "saveCustomerResponse");
    private final static QName _NoSuchCustomer_QNAME = new QName("http://training.fusesource.com/", "NoSuchCustomer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fusesource.training
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerByName }
     * 
     */
    public GetCustomerByName createGetCustomerByName() {
        return new GetCustomerByName();
    }

    /**
     * Create an instance of {@link GetCustomerByNameResponse }
     * 
     */
    public GetCustomerByNameResponse createGetCustomerByNameResponse() {
        return new GetCustomerByNameResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link SaveCustomer }
     * 
     */
    public SaveCustomer createSaveCustomer() {
        return new SaveCustomer();
    }

    /**
     * Create an instance of {@link NoSuchCustomer }
     * 
     */
    public NoSuchCustomer createNoSuchCustomer() {
        return new NoSuchCustomer();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.fusesource.com/", name = "getCustomerByName")
    public JAXBElement<GetCustomerByName> createGetCustomerByName(GetCustomerByName value) {
        return new JAXBElement<GetCustomerByName>(_GetCustomerByName_QNAME, GetCustomerByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.fusesource.com/", name = "getCustomerByNameResponse")
    public JAXBElement<GetCustomerByNameResponse> createGetCustomerByNameResponse(GetCustomerByNameResponse value) {
        return new JAXBElement<GetCustomerByNameResponse>(_GetCustomerByNameResponse_QNAME, GetCustomerByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.fusesource.com/", name = "getAllCustomers")
    public JAXBElement<Object> createGetAllCustomers(Object value) {
        return new JAXBElement<Object>(_GetAllCustomers_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.fusesource.com/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.fusesource.com/", name = "saveCustomer")
    public JAXBElement<SaveCustomer> createSaveCustomer(SaveCustomer value) {
        return new JAXBElement<SaveCustomer>(_SaveCustomer_QNAME, SaveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.fusesource.com/", name = "saveCustomerResponse")
    public JAXBElement<SaveCustomer> createSaveCustomerResponse(SaveCustomer value) {
        return new JAXBElement<SaveCustomer>(_SaveCustomerResponse_QNAME, SaveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoSuchCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://training.fusesource.com/", name = "NoSuchCustomer")
    public JAXBElement<NoSuchCustomer> createNoSuchCustomer(NoSuchCustomer value) {
        return new JAXBElement<NoSuchCustomer>(_NoSuchCustomer_QNAME, NoSuchCustomer.class, null, value);
    }

}
