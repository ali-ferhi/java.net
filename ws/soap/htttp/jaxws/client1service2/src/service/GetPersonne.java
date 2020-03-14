
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getPersonne complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPersonne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonne", propOrder = {
    "identifiant"
})
public class GetPersonne {

    protected int identifiant;

    /**
     * Obtient la valeur de la propri�t� identifiant.
     * 
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * D�finit la valeur de la propri�t� identifiant.
     * 
     */
    public void setIdentifiant(int value) {
        this.identifiant = value;
    }

}
