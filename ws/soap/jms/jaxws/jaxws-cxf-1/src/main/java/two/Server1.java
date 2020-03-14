package two;

import javax.jms.ConnectionFactory;
import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceFeature;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.jms.ConnectionFactoryFeature;

import one.Service1Impl;

public class Server1 {
	
	public static void main(String args[]) throws InterruptedException {
		
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");		
		String url = "jms:queue:input";
		Service1Impl implementor = new Service1Impl();
		EndpointImpl endpoint = (EndpointImpl) Endpoint.create(implementor);
		WebServiceFeature feature = new ConnectionFactoryFeature(connectionFactory);
		endpoint.getFeatures().add((Feature) feature);		
		endpoint.publish(url);
		
		Thread.sleep(60 * 60 * 1000); 
		endpoint.stop();
        System.exit(0);
	}
}
