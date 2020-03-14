
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour add complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operand1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operand2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "operand1",
    "operand2"
})
public class Add {

    protected double operand1;
    protected double operand2;

    /**
     * Obtient la valeur de la propriété operand1.
     * 
     */
    public double getOperand1() {
        return operand1;
    }

    /**
     * Définit la valeur de la propriété operand1.
     * 
     */
    public void setOperand1(double value) {
        this.operand1 = value;
    }

    /**
     * Obtient la valeur de la propriété operand2.
     * 
     */
    public double getOperand2() {
        return operand2;
    }

    /**
     * Définit la valeur de la propriété operand2.
     * 
     */
    public void setOperand2(double value) {
        this.operand2 = value;
    }

}
