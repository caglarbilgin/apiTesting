package util;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BDDStyle {

    public static void checkUniqueId(String url) {
        Response getExample =
                given()

                        .when()
                        .get(url).
                        then()
                        .assertThat().statusCode(200)
                        .extract().response();

        //getExample.getBody().prettyPrint();

        List<Integer> ids = getExample.jsonPath().getList("id");
        //System.out.println("Dönen veriler : " + ids.get(99));

        for(int i=0 ; i<ids.size(); i++){
            for(int j =i+1 ; j<ids.size(); j ++){
               if(ids.get(i).equals(ids.get(j))) {
                    Assert.fail();

               }
            }
        }


    }


}
