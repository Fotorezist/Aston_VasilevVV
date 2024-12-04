import java.util.HashMap;
import java.util.Map;


    public class Main {
        public static void main(String[] args) {
            String str = "Hello, world!";
            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }

            System.out.println(arr);
        }
    }
