package lab6enrich;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class ExampleAggregationStrategy  implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange original, Exchange resource) {
		// TODO Auto-generated method stub
		
		Object originalBody = original.getIn().getBody();
		Object resourceResponse =  resource.getIn().getBody();
		Object mergeResult = originalBody + "  " + resourceResponse;
		
		original.getIn().setBody(mergeResult);
		return original;
				
	}

}
