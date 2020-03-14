
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getIdentifiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getIdentifiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personne" type="{http://ferhi.com/identification}personne" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdentifiant", propOrder = {
    "personne"
})
public class GetIdentifiant {

    protected Personne personne;

    /**
     * Obtient la valeur de la propriété personne.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getPersonne() {
        return personne;
    }

    /**
     * Définit la valeur de la propriété personne.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setPersonne(Personne value) {
        this.personne = value;
    }

}
