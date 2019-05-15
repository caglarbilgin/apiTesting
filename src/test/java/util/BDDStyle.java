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

        List<Integer> ids = getExample.jsonPath().getList("id");

        for (int i = 0; i < ids.size(); i++) {
            for (int j = i + 1; j < ids.size(); j++) {
                if (ids.get(i).equals(ids.get(j))) {
                    Assert.fail();
                }
            }
        }
    }

    public static void postForUser(String url) {
        Response getExample =
                given()
                        .when()
                        .get(url).
                        then()
                        .assertThat().statusCode(200)
                        .extract().response();


        List<Integer> ids = getExample.jsonPath().getList("userId");
        Integer curr = null;
        int count = 0;
        System.out.print("{");
        for (int val : ids) {
            if (curr == null) {
                curr = val;
                count = 1;
            }
            else if (curr != val) {
                System.out.print("(" + curr + ", " + count + ")");
                curr = val;
                count = 1;
            }
            else {
                ++count;
            }
        }
        System.out.print("(" + curr + ", " + count + ")");
        System.out.print("}");
    }

}
