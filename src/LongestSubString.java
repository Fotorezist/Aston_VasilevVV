import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
//        Написать метод, который принимает на вход строку и ищет в ней самую длинную подстроку,
//        состоящую из одинаковых символов. Если таких подстрок несколько, то искомая подстрока - самая левая
//        Метод возвращает найденную подстроку.
//         input: 1551117770000000000009

        String str = "1551117770000000000009";
        System.out.println("Самая длинная подстрока " + returnString(str));
        System.out.println("Самая длинная подстрока " + returnStr(str));
    }
//    Требуется новая Java(23)
    public static String returnStr (String input){
        var chars = input.toCharArray();
        var map = new LinkedHashMap<Character, Integer>();
        for(var temp : chars){
            map.compute(temp,( _ , oldvalue)-> oldvalue == null ? 1 : oldvalue + 1);
        }
        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry :: getValue))
                .map(entry -> {
                    var stringBuilder = new StringBuilder();
                    var current = entry.getKey();
                    stringBuilder.append(
                            String.valueOf(current)
                                    .repeat(Math.max(0, entry.getValue()))
                    );
                    return stringBuilder.toString();
                }).orElseThrow(IllegalArgumentException::new);

    }
//    Работает на старых версиях
    public static String returnString(String input){
        char maxChar = input.charAt(0);
        int maxLenght = 1;
        int curLenght = 1;

        for (int i = 1; i < input.length(); i++){
            if(input.charAt(i) == input.charAt(i - 1)){
                curLenght++;
            } else {
                if(curLenght > maxLenght){
                    maxLenght = curLenght;
                    maxChar = input.charAt(i - 1);
                }
                curLenght = 1;
            }
        }
        if(curLenght > maxLenght){
            maxLenght = curLenght;
            maxChar = input.charAt(input.length() - 1);
        }
        StringBuilder longestSubstring = new StringBuilder();
        for (int i = 0; i < maxLenght; i++){
            longestSubstring.append(maxChar);
        }
        return longestSubstring.toString();
    }
}
