public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива!");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке: [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}


