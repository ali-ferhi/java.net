
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _Personne_QNAME = new QName("http://ferhi.com/personne", "personne");
    private final static QName _Identifiant_QNAME = new QName("http://ferhi.com/personne", "identifiant");
    private final static QName _GetIdentifiant_QNAME = new QName("http://ferhi.com/identification", "getIdentifiant");
    private final static QName _GetPersonne_QNAME = new QName("http://ferhi.com/identification", "getPersonne");
    private final static QName _GetPersonneResponse_QNAME = new QName("http://ferhi.com/identification", "getPersonneResponse");
    private final static QName _GetIdentifiantResponse_QNAME = new QName("http://ferhi.com/identification", "getIdentifiantResponse");
    private final static QName _Nom_QNAME = new QName("http://ferhi.com/personne", "nom");
    private final static QName _Prenom_QNAME = new QName("http://ferhi.com/personne", "prenom");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIdentifiant }
     * 
     */
    public GetIdentifiant createGetIdentifiant() {
        return new GetIdentifiant();
    }

    /**
     * Create an instance of {@link GetPersonne }
     * 
     */
    public GetPersonne createGetPersonne() {
        return new GetPersonne();
    }

    /**
     * Create an instance of {@link GetPersonneResponse }
     * 
     */
    public GetPersonneResponse createGetPersonneResponse() {
        return new GetPersonneResponse();
    }

    /**
     * Create an instance of {@link GetIdentifiantResponse }
     * 
     */
    public GetIdentifiantResponse createGetIdentifiantResponse() {
        return new GetIdentifiantResponse();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/personne", name = "personne")
    public JAXBElement<Personne> createPersonne(Personne value) {
        return new JAXBElement<Personne>(_Personne_QNAME, Personne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/personne", name = "identifiant")
    public JAXBElement<Integer> createIdentifiant(Integer value) {
        return new JAXBElement<Integer>(_Identifiant_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentifiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/identification", name = "getIdentifiant")
    public JAXBElement<GetIdentifiant> createGetIdentifiant(GetIdentifiant value) {
        return new JAXBElement<GetIdentifiant>(_GetIdentifiant_QNAME, GetIdentifiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/identification", name = "getPersonne")
    public JAXBElement<GetPersonne> createGetPersonne(GetPersonne value) {
        return new JAXBElement<GetPersonne>(_GetPersonne_QNAME, GetPersonne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/identification", name = "getPersonneResponse")
    public JAXBElement<GetPersonneResponse> createGetPersonneResponse(GetPersonneResponse value) {
        return new JAXBElement<GetPersonneResponse>(_GetPersonneResponse_QNAME, GetPersonneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentifiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/identification", name = "getIdentifiantResponse")
    public JAXBElement<GetIdentifiantResponse> createGetIdentifiantResponse(GetIdentifiantResponse value) {
        return new JAXBElement<GetIdentifiantResponse>(_GetIdentifiantResponse_QNAME, GetIdentifiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/personne", name = "nom")
    public JAXBElement<String> createNom(String value) {
        return new JAXBElement<String>(_Nom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ferhi.com/personne", name = "prenom")
    public JAXBElement<String> createPrenom(String value) {
        return new JAXBElement<String>(_Prenom_QNAME, String.class, null, value);
    }

}
