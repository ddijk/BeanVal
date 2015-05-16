package nl.ortecfinance.opal.beanval;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

@ApplicationPath("res")
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        
        System.out.println("Setting BV_SEND_ERROR_IN_RESPONSE on ");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        System.err.println("BV_SEND_ERROR_IN_RESPONSE done");
    }

    
    
    
    
    
    

    
}