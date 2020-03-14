package two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server2 {

	
public static void main(String args[]) throws InterruptedException {
		
		String[] springConfig  =  {"two/server2.xml"};  
		ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(springConfig);
    	
		springContext.close();
	}
}
