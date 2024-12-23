import java.util.Stack;

public class BracketsValidate {
    //        System.out.println(validate("([{}])"));
    public static void main(String[] args) {
        String str = "([{}])";
        System.out.println(validate(str));
        System.out.println(valid(str));
    }
    public static boolean validate(String str){
        Stack<Character> stack = new Stack<>();
        for (char i : str.toCharArray()){
            switch (i){
                case ('(') : stack.add(')');
                break;
                case (')') :
                    if (stack.isEmpty() || stack.pop() !=')'){
                        return false;
                    }break;
                case ('[') : stack.add(']');
                    break;
                case (']') :
                    if (stack.isEmpty() || stack.pop() !=']'){
                        return false;
                    }break;
                case ('{') : stack.add('}');
                    break;
                case ('}') :
                    if (stack.isEmpty() || stack.pop() !='}'){
                        return false;
                    }break;
            }
        }
        return stack.isEmpty();
    }
    public static boolean valid(String str){
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char s : arr){
            switch (s){
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case '(' -> stack.push(')');
                case '}', ')', ']' -> {
                    if (stack.isEmpty() || stack.pop() != s){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
