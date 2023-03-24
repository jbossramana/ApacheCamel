package lab1;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

public class BeanA {

	//static String test="";
	
	public void disp1(Exchange msg)
	{
		
		Message m = msg.getIn();
		
		if (m.getBody() instanceof String )
				
			System.out.println("inside disp1, body contains String :" + m.getBody());
			
		else
			System.out.println("inside disp1, body contains Customer object  :" + m.getBody() );
			
	}
	
	
	public void disp2(Exchange msg)
	{
		
		Message m = msg.getIn();
		
	String	test = (String) m.getBody();
		
		System.out.println("inside disp2 bean :" + test);
	}
	
	
	public void setCustomer(Exchange msg)
	{
		
		Message m = msg.getIn();
		
	String	test = (String) m.getBody();
	
	Customer cust = new Customer();
	cust.setId(test);
	
	msg.getIn().setBody(cust);
	
			}
	
		
}
 