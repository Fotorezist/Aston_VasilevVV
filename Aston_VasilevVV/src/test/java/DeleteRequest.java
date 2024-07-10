import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain") // Указываем тип содержимого
//                .queryParam("key", "value") // Добавляем параметры
                .delete("/delete"); // Определяем конечную точку /delete

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();
    }
}
