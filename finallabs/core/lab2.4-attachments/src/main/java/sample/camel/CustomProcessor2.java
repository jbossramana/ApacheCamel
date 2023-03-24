package sample.camel;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.attachment.Attachment;
import org.apache.camel.attachment.AttachmentMessage;
import org.apache.camel.attachment.DefaultAttachment;
import org.springframework.stereotype.Component;

@Component("customProcessor2")
public class CustomProcessor2 implements Processor {
    public void process(Exchange exchange) throws Exception {
    	
    	 char[] array = new char[100];
    	 
    	AttachmentMessage attMsg = exchange.getIn(AttachmentMessage.class);
    	Attachment attachment = attMsg.getAttachmentObject("jndi-example");
    	DataHandler dh = attachment.getDataHandler();
        System.out.println("restult "+ dh.getContent());
        
        FileInputStream fin=(FileInputStream) dh.getContent();
        int i=0;    
        while((i=fin.read())!=-1){    
         System.out.print((char)i);    
        }   
        

    }
}