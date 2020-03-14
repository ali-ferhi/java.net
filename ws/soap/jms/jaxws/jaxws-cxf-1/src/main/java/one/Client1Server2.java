package one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1Server2 {
	
	public static void main(String args[]) {
	
		String[] springConfig  =  {"one/client1server2.xml"};  
		ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(springConfig);
	
		Service1 client = (Service1) springContext.getBean("client1");	
		String salam = client.getSalam("ali");
		
		springContext.close();
	}

}
