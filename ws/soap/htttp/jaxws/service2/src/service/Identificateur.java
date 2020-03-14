package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entites.Personne;

@WebService(serviceName="Identificateur", targetNamespace="http://ferhi.com/identification")
public class Identificateur {
	
	@WebMethod(operationName="getPersonne")
	@WebResult(name="personne" , targetNamespace="http://ferhi.com/identification")
	public Personne getPersonne(@WebParam(name="identifiant", targetNamespace="http://ferhi.com/identification")int identifiant) {
		return new Personne(identifiant, "Ali", "FERHI");
	}
	
	@WebMethod(operationName="getIdentifiant")
	@WebResult(name="identifiant" , targetNamespace="http://ferhi.com/identification")
	public int getIdentifiant(@WebParam(name="personne", targetNamespace="http://ferhi.com/identification")Personne personne) {
		return personne.getIdentifiant();
	}

}
