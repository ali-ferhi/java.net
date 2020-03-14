package one;

import javax.jws.Oneway;
import javax.jws.WebService;

@WebService
public interface Service1 {
	
	@Oneway
	public String getSalam(String name);

}
