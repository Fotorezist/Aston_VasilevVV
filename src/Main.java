import java.io.IOException;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.header;

public static void main(String[] args) {
        // Пример использования String[] headers = {"Column1", "Column2", "Column3"};
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        AppData appData = new AppData(header, data);
        String filePath = "data.csv";

        try {
            // Сохранение данных в CSV файл appData.save(filePath);
            System.out.println("Данные успешно сохранены в " + filePath);

            // Загрузка данных из CSV файла
            AppData loadedData = AppData.load(filePath);
            System.out.println("Данные успешно загружены из " + filePath);

            // Вывод заголовков System.out.println("Заголовки: " + String.join(", ", loadedData.getHeader()));

            // Вывод загруженных данных
            for (int[] row : loadedData.getData()) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }

