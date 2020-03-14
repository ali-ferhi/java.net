package main;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import service.Calculateur;
import service.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		QName qname = calculator.getServiceName();
		//QName serviceName   = new QName("http://service/", "Calculator");
		try {
			URL url = new URL("http://ferhi:8088/CalculatorMockService?WSDL");
			Service service = Service.create(url, qname);
			Calculateur stub = service.getPort(Calculateur.class);
			//Calculateur stub = calculator.getCalculateurPort();
			
			double somme = stub.add(4, 2);
			double produit = stub.multiply(4, 2);
			System.out.println("Somme = " +somme);
			System.out.println("Produit = " +produit);
		} catch (MalformedURLException e) {
			System.out.println("URL erronée.");
		}
		

	}

}
