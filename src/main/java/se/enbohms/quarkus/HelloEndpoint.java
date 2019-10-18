package se.enbohms.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/hi")
@ApplicationScoped
@Tag(name = "quarkus", description = "Some OpenAPI description")
public class HelloEndpoint {

  @GET
  @Operation(summary = "Say hi", description = "An OpenAPI description of saying hi")
  @APIResponses(value = {@APIResponse(responseCode = "200")})
  public Response sayHi() {
    return Response.ok("hello").build();
  }

}
