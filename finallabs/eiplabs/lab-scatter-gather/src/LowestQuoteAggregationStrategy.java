import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class LowestQuoteAggregationStrategy implements AggregationStrategy {
	
   public 	LowestQuoteAggregationStrategy()
   {
	System.out.println("Constructor is called");
   }
   
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
    	
    	System.out.println("aggregate is called");
    	
        // the first time we only have the new exchange
        if (oldExchange == null) {
            return newExchange;
        }
 
        if (oldExchange.getIn().getBody(int.class) < newExchange.getIn().getBody(int.class)) {
            return oldExchange;
        } else {
            return newExchange;
        }
    }


}