
import org.apache.camel.builder.RouteBuilder;


/*
 * Batch Resequencing : The following example shows how to use the
* batch-processing resequencer so that messages are sorted in order 
* of the body() expression. 
 */

public class ChoiceRouteBuilder extends RouteBuilder {

    /**
     * allows you to reorganise messages based on some comparator
     */
    public void configure() {

    	from("direct:start")
       .resequence().body()
       // set .reverse() for descending order
       // resequencer(header("mySeqNo"))
       //.batch().size(300).timeout(4000L)
        .to("direct:result");
    	
    
    	from("direct:result")
    	.log("message : ${body}");
    	
    	
    }

}
