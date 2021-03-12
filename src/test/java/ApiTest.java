import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class ApiTest {

    Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void shouldBeAbleToGetOKResponse() {
        RequestSpecification requestSpecification = given().baseUri("https://www.google.com/");
        Response response = requestSpecification.get();
        int statusCode = response.getStatusCode();
        logger.info("Status Code: {}", statusCode);
       assertEquals(200, statusCode);
    }
}
