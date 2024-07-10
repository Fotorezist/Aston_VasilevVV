import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://postman-echo.com";


        Response response = RestAssured
                .given()
                .queryParam("foo", "bar")
                .queryParam("baz", "qux")
                .get("/get");

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();
    }
}