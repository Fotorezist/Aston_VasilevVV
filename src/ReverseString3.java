public class ReverseString3 {
    public static void main(String[] args) {
       // Развернуть строку 3 разными способами

        String original = "Оригинальная строка";
        System.out.println(original);
        String reverse1 = new StringBuilder(original).reverse().toString();
        System.out.println("Развёрнутая строка (reverse) : " + reverse1);

        String reverse2 = "";
        for (int i = original.length() - 1; i >= 0; i--){
            reverse2 += original.charAt(i);
        }
        System.out.println("Развёрнутая строка (цикл) : " + reverse2);

        String reverse3 = original.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s1 + s2);
        System.out.println("Развёрнутая строка (stream) : " + reverse1);
    }
}
