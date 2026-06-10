import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEcho {

    private final String BASE_URL = "https://postman-echo.com";

    @Test
    void getRequestTest() {

        given()
                .queryParam("name", "Adelina")
                .when()
                .get(BASE_URL + "/get")
                .then()
                .statusCode(200)
                .body("args.name", org.hamcrest.Matchers.equalTo("Adelina"));
    }
    @Test
    void postRequestTest() {

        String requestBody = "{\"name\": \"Adelina\"}";

        given()
                .contentType("application/json")
                .body("{\"name\":\"Adelina\"}")
                .when()
                .post(BASE_URL + "/post")
                .then()
                .statusCode(200)
                .body("json.name", equalTo("Adelina"));;
    }
    @Test
    void putRequestTest() {
        given()
                .contentType("application/json")
                .body("{\"name\": \"Adelina\"}")
                .when()
                .put(BASE_URL + "/put")
                .then()
                .statusCode(200)
                .body("json.name", equalTo("Adelina"));
    }
    @Test
    void patchRequestTest() {
        given()
                .contentType("application/json")
                .body("{\"name\": \"Adelina\"}")
                .when()
                .patch(BASE_URL + "/patch")
                .then()
                .statusCode(200)
                .body("json.name", equalTo("Adelina"));
    }
    @Test
    void deleteRequestTest() {
        given()
                .when()
                .delete(BASE_URL + "/delete")
                .then()
                .statusCode(200);
    }
}

