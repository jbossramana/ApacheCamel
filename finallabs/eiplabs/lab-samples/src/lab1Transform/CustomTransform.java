package lab1Transform;



public class CustomTransform {

    public static Customer toCustom(String body) {
    	
    	
    	Customer cust = new Customer();
    	cust.setId(body);
    	
    	return cust;
    }
    
}
