import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://postman-echo.com";

//        Создаем JSON тело запроса
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json") // Указываем тип содержимого
                .body(requestBody) // Устанавливаем тело запроса
                .put("/put"); // Определяем конечную точку /put

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();
    }
}
