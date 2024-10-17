import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    // Метод для сохранения данных в CSV файл
    public void save(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Записываем заголовок
            writer.write(String.join(";", header));
            writer.newLine();

            // Записываем данные
            for (int[] row : data) {
                StringBuilder rowString = new StringBuilder();
                for (int value : row) {
                    rowString.append(value).append(";");
                }
                // Удаляем последний символ ';' и записываем строку writer.write(rowString.substring(0, rowString.length() - 1));
                writer.newLine();
            }
        }
    }

    // Метод для загрузки данных из CSV файла
    public static AppData load(String filePath) throws IOException {
        List<String> headersList = new ArrayList<>();
        List<int[]> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Читаем заголовок
            String headerLine = reader.readLine();
            if (headerLine != null) {
                headersList.addAll(List.of(headerLine.split(";")));
            }

            // Читаем данные
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                int[] intValues = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    intValues[i] = Integer.parseInt(values[i]);
                }
                dataList.add(intValues);
            }
        }

        // Преобразуем списки в массивы String[] headers = headersList.toArray(new String[0]);
        int[][] data = dataList.toArray(new int[0][]);
        return new AppData(headers, data);
    }
}
