public class ReverseString1 {

        public static void main(String[] args) {
            //Развернуть произвольную строку не используя методы типа revers() и используя один массив
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

