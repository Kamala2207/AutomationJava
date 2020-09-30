package classwork;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class postJsonPayload {

    @Test
    public void create_user_responseCode(){


        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"name\": \"sandesh\",\"job\": \"teacher\"}")
                .when()
                .post("https://reqres.in/api/users");

        System.out.println("POST Response\n" + response.asString());

        response.then().body("name", Matchers.is("sandesh"));
        assertEquals(response.getStatusCode(),201);

    }
}
