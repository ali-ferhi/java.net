package serveur;

import javax.xml.ws.Endpoint;

import service.Calculateur;

public class Serveur {
	
	public static void main(String args[]) {
		
		String url = "http://localhost:8585/";
		Endpoint.publish(url, new Calculateur());
	}

}