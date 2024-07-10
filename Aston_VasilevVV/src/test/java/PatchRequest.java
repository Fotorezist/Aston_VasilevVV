import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PatchRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://postman-echo.com";

//        Создаем JSON тело запроса
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain") // Указываем тип содержимого
                .body(requestBody) // Устанавливаем тело запроса
                .patch("/patch"); // Определяем конечную точку /patch

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();
    }
}
