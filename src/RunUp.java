public class RunUp {
    //        Напишите абстрактный класс BaseConverter, у класса должен быть абстрактный метод
//        convert(double celsius), который возвращает значение в нужных единицах для конвертации из градусов по Цельсию
//        в Кельвины, Фаренгейты, и т.п. Создайте отдельные классы-наследники (KelvinConverter, FahrenheitConverter)
//        с реализацией метода convert, который будет принимать на вход значение в цельсиях и переводить
//        их в соответствующие градусы (Кельвины, Фаренгейты)
//                (0°C× 9/5) +32=32°F
//0 °C + 273,15 = 273,15 K

    public static void main(String[] args) {
        double celsius = 10;

        BaseConverter kelvinConverter = new KelvinConverter();
        BaseConverter fahrenheitConverter = new FahrenheitConverter();

        double kelvins = kelvinConverter.convert(celsius);
        double fahrenheit = fahrenheitConverter.convert(celsius);

        System.out.println(celsius + "градусов цельсия = " + kelvins + "градусов кельвина");
        System.out.println(celsius + "градусов цельсия = " + fahrenheit + "градусов фаренгейта");
    }
}
abstract class BaseConverter{
    public abstract double convert(double celsius);
}
class KelvinConverter extends BaseConverter{
    @Override
    public double convert(double celsius){
        return celsius + 273.15;
    }
}
class FahrenheitConverter extends BaseConverter{
    @Override
    public double convert(double celsius){
        return (celsius * 9/5) + 32;
    }
}
