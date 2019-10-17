package se.enbohms.quarkus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class HelloEndpointTest {

  @Test
  public void testHelloEndpoint() {
    given().when().get("/hi").then().statusCode(200).body(is("hello"));
  }

  @Test
  public void testFetchOpenapi() {
    given().when().get("/openapi").then().statusCode(200);
  }
}
