package classwork.RestAssuredAPI;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.get;
import static org.testng.AssertJUnit.assertEquals;


public class RestAssuredIntro {


    @Test
    public void get_single_user_verify_first_name_reqresin(){

        /*
        {"data":{"id":2,"email":"janet.weaver@reqres.in","first_name":"Janet",
        "last_name":"Weaver","avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"}}
         */
        //Response response = get("https://reqres.in/api/users/2" );

        Response response=get("https://reqres.in/api/users/2");
        //System.out.println(response.asString());
        response.then().body("data.first_name", Matchers.is("Janet")); //value of json
        assertEquals(200,response.getStatusCode()); //Response Code..
}

//@Test
//    public void print_first_name_reqresin(){
//
//    Response response=get("");
//    System.out.println(response.asString());
//    System.out.println("Temperature::" + response.jsonPath().getString("main.temp"));
//    System.out.println("Humidity::" + response.jsonPath().getString("main.humidity"));
//    System.out.println("Array Weather::" + response.jsonPath().getString("weather[0].main"));
//
//
//}
}