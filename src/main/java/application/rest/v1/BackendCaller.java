package application.rest.v1;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.Fallback;

@ApplicationScoped
public class BackendCaller {

    @Fallback(fallbackMethod="fallback")
    public String call() {
        Client client = ClientBuilder.newClient();
        Response response = client.target("http://demo-backend-service:9080/v1/example").request().get();
        String message = response.readEntity(String.class);
        client.close();
        return message;
    }

    public String fallback() {
        return "Unavailable";
    }

}