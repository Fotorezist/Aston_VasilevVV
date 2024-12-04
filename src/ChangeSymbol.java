public class ChangeSymbol {
    public static void main(String[] args) {
        //Заменить * на а, используя цикл "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро"
        String str = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро";

        char oldChar = '*';
        char newChar = 'а';

        String newStr = replaceChar (str, oldChar, newChar);
        System.out.println(newStr);


    }
    public static String replaceChar(String str, char oldChar, char newChar){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            chars[i] = chars[i] == oldChar ? newChar : chars[i];
//            if (chars[i]==oldChar){
//                chars[i] = newChar;
//            }
        }
        return String.valueOf(chars);
    }
}
