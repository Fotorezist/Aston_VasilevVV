import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRawTextRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://postman-echo.com";

//        Текст, который будет отправлен в теле запроса
        String requestBody = "'test':'value'";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain")  // Указываем тип содержимого
                .body(requestBody)  // Устанавливаем тело запроса
                .post("/post");  // Определяем конечную точку /post

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();
    }
}