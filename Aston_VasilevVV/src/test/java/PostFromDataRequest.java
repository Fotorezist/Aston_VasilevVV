import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostFromDataRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = RestAssured
                .given()
                .multiPart("foo1", "bar1")  // Добавляем первую пару ключ-значение
                .multiPart("foo2", "bar2")  // Добавляем вторую пару ключ-значение
                .post("/post");  // Определяем конечную точку /post

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();
    }
}
