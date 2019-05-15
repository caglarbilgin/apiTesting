package util;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class BDDStyle {

    public static void simpleGETPost() {
        given().contentType(ContentType.JSON).queryParam("_page",1).queryParam("_limit",9).
                when().get(String.format("https://jsonplaceholder.typicode.com/posts")).
                then().body("id",containsInAnyOrder(1,2));

    }
}
