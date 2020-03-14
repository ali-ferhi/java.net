package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="Calculator")
public class Calculateur {
	
	@WebMethod(operationName="add")
	public double additionner(@WebParam(name="operand1")double operande1, @WebParam(name="operand2")double operande2) {
		return operande1 + operande2;
	}
	
	@WebMethod(operationName="multiply")
	public double mutiplier(@WebParam(name="operand1")double operande1, @WebParam(name="operand2")double operande2) {
		return operande1 * operande2;
	}
	
}
