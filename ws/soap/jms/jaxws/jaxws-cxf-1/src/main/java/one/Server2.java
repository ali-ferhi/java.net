package one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server2 {

	
public static void main(String args[]) throws InterruptedException {
		
		String[] springConfig  =  {"one/server2.xml"};  
		ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(springConfig);
    	
		//Thread.sleep(60 * 60 * 1000);   
		springContext.close();
        //System.exit(0);
	}
}
