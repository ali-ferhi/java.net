package one;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.ws.Endpoint;

public class Server1 {
	
	public static void main(String args[]) throws InterruptedException {
		
		String url = "http://localhost:8585/";
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Endpoint endpoint = Endpoint.create(new Service1Impl());
		endpoint.setExecutor(executor);
		endpoint.publish(url);
		Thread.sleep(60 * 60 * 1000);  
		endpoint.stop();
        System.exit(0);
	}
}
