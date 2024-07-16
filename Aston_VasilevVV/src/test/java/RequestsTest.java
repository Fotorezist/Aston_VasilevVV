import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RequestsTest {

    @BeforeClass
    public void setup() {
//        Устанавливаем базовый URI
        RestAssured.baseURI = "https://postman-echo.com";
    }
    @Test(description="Проверка реквеста Delete", priority = 1)
    public void testDeleteRequest() {

        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .delete("/delete");

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();

//        Ожидаемые значения
        int expectedStatusCode = 200;
        String expectedUrl = "https://postman-echo.com/delete";
        String expectedPort = "443";
        String expectedHost = "postman-echo.com";

//        Проверяем статус-код ответа
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Статус код ответа" + response.getStatusCode());

//        Проверяем значения полей в теле ответа
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains(expectedUrl), "URL не совпадает");
        Assert.assertTrue(responseBody.contains(expectedPort), "Порт не совпадает");
        Assert.assertTrue(responseBody.contains(expectedHost), "Хост не совпадает");
    }
    @Test(description="Проверка реквеста Put", priority = 2)
    public void testPutRequest() {

//        Создаем JSON тело запроса
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .put("/put");

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();

//        Ожидаемые значения
        int expectedStatusCode = 200;
        String expectedUrl = "https://postman-echo.com/put";
        String expectedPort = "443";
        String expectedHost = "postman-echo.com";

//        Проверяем статус-код ответа
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Статус код ответа" + response.getStatusCode());

//        Проверяем значения полей в теле ответа
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains(expectedUrl), "URL не совпадает");
        Assert.assertTrue(responseBody.contains(expectedPort), "Порт не совпадает");
        Assert.assertTrue(responseBody.contains(expectedHost), "Хост не совпадает");
    }

    @Test(description="Проверка реквеста Patch", priority = 3)
    public void testPatchRequest() {

//        Создаем JSON тело запроса
            String requestBody = "This is expected to be sent back as part of response body.";

            Response response = RestAssured
                    .given()
                    .header("Content-Type", "text/plain")
                    .body(requestBody)
                    .patch("/patch");

//        Выводим статус кода ответа
            System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
            System.out.println("Response Body: ");
            response.getBody().prettyPrint();

//        Ожидаемые значения
            int expectedStatusCode = 200;
            String expectedUrl = "https://postman-echo.com/patch";
            String expectedPort = "443";
            String expectedHost = "postman-echo.com";

//        Проверяем статус-код ответа
            Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Статус код ответа" + response.getStatusCode());

//        Проверяем значения полей в теле ответа
            String responseBody = response.getBody().asString();
            Assert.assertTrue(responseBody.contains(expectedUrl), "URL не совпадает");
            Assert.assertTrue(responseBody.contains(expectedPort), "Порт не совпадает");
            Assert.assertTrue(responseBody.contains(expectedHost), "Хост не совпадает");
        }
    @Test(description="Проверка реквеста Get", priority = 4)
    public void testGetRequest() {

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

//        Ожидаемые значения
        int expectedStatusCode = 200;
        String expectedUrl = "https://postman-echo.com/get";
        String expectedPort = "443";
        String expectedHost = "postman-echo.com";
        String expectedArgs1 = "\"foo\": \"bar\"";
        String expectedArgs2 = "\"baz\": \"qux\"";

//        Проверяем статус-код ответа
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Статус код ответа" + response.getStatusCode());

//        Проверяем значения полей в теле ответа
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains(expectedUrl), "URL не совпадает");
        Assert.assertTrue(responseBody.contains(expectedPort), "Порт не совпадает");
        Assert.assertTrue(responseBody.contains(expectedHost), "Хост не совпадает");
        Assert.assertTrue(responseBody.contains(expectedArgs1), "Первая пара аргументов не совпадает");
        Assert.assertTrue(responseBody.contains(expectedArgs2), "Вторая пара аргументов не совпадает");
    }

    @Test(description="Проверка реквеста Postfromdata", priority = 5)
    public void testPostFromDataRequest() {

        Response response = RestAssured
                .given()
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .post("/post");

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();

//        Ожидаемые значения
        int expectedStatusCode = 200;
        String expectedUrl = "https://postman-echo.com/post";
        String expectedPort = "443";
        String expectedHost = "postman-echo.com";
        String expectedForm1 = "\"foo1\": \"bar1\"";
        String expectedForm2 = "\"foo2\": \"bar2\"";

//        Проверяем статус-код ответа
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Статус код ответа" + response.getStatusCode());

//        Проверяем значения полей в теле ответа
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains(expectedUrl), "URL не совпадает");
        Assert.assertTrue(responseBody.contains(expectedPort), "Порт не совпадает");
        Assert.assertTrue(responseBody.contains(expectedHost), "Хост не совпадает");
        Assert.assertTrue(responseBody.contains(expectedForm1), "Первая пара значений не совпадает");
        Assert.assertTrue(responseBody.contains(expectedForm2), "Вторая пара значений не совпадает");
    }

    @Test(description="Проверка реквеста Postfromrawtext", priority = 6)
    public void testPostRawTextRequest() {

//        Текст, который будет отправлен в теле запроса
        String requestBody = "test:value";

        Response response = RestAssured
                .given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .post("/post");

//        Выводим статус кода ответа
        System.out.println("Status Code: " + response.getStatusCode());

//        Выводим тело ответа
        System.out.println("Response Body: ");
        response.getBody().prettyPrint();

//        Ожидаемые значения
        int expectedStatusCode = 200;
        String expectedUrl = "https://postman-echo.com/post";
        String expectedPort = "443";
        String expectedHost = "postman-echo.com";
        String expectedData = "test:value";

//        Проверяем статус-код ответа
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Статус код ответа" + response.getStatusCode());

//        Проверяем значения полей в теле ответа
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains(expectedUrl), "URL не совпадает");
        Assert.assertTrue(responseBody.contains(expectedPort), "Порт не совпадает");
        Assert.assertTrue(responseBody.contains(expectedHost), "Хост не совпадает");
        Assert.assertTrue(responseBody.contains(expectedData), "Вносимые данные не совпадают");
    }

}
