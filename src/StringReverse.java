public class StringReverse {
    public static void main(String[] args) {
//        Развернуть строку методом reverse()

        String str1 = "String";
        StringBuilder str2 = new StringBuilder(str1);
        System.out.println("Развёрнутая строка " + str2.reverse());
    }
}
