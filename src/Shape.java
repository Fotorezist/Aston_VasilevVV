interface Shape {
// Дефолтный метод для расчета периметра
default double calculatePerimeter() {
        return 0;
}

// Дефолтный метод для расчета площади
default double calculateArea()
{
        return 0;
                }

// Метод для получения цвета заливки
String getFillColor();

// Метод для получения цвета границы
String getBorderColor();
}
