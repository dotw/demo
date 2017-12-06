package application.rest.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("v1/example")
public class Example {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response example() {
        Client client = ClientBuilder.newClient();
        Response response = client.target("http://demo-backend-service:9080/v1/example").request().get();
        String message = response.readEntity(String.class);
        client.close();
        return Response.ok("Received: " + message).build();
    }

}
