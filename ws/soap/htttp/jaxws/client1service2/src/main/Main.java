package main;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.Identificateur;
import service.Personne;



public class Main {

	public static void main(String[] args) throws MalformedURLException {
		QName qname = new QName("http://ferhi.com/identification", "Identificateur");
		//URL url = new URL("http://localhost:8585/Identificateur?WSDL");
		URL url = new URL("http://ferhi:8586/MockIdentificateur?WSDL");
		Service service = Service.create(url, qname);
		Identificateur stub = service.getPort(Identificateur.class);
		Personne personne = stub.getPersonne(21);
		if(personne != null) {
			System.out.println("Identfiant : " + personne.getIdentifiant());
			System.out.println("Prenom : " + personne.getPrenom());
			System.out.println("Nom : " + personne.getNom());
		} else {
			System.out.println("Personne non trouvee");
		}

	}

}
