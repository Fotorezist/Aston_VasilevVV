import static jdk.nashorn.internal.objects.NativeString.trim;

public class Main {

    public static void main(String[] args) {

//      Создние массива string 4x4

        String[][] array = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

//      Проверка на ошибки

        try {
            int result = sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {

//      Проверка размера массива

        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива!");
        }
        else {
            System.out.println("\u001B[32m" + "Массив правильного размера" + "\u001B[0m");
        }

//        Суммирование и проверка данных в массиве

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(trim(array[i][j]));
                } catch (IllegalArgumentException e) {
                    throw new MyArrayDataException("Не подходящие для суммирования данные в ячейке: [" + i + "][" + j + "]");
                }
            }
        }
            System.out.println("\u001B[32m" + "Данные в массиве подходят для суммирования" + "\u001B[0m");

        return sum;
    }
}


