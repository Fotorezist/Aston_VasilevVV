import java.util.ArrayList;
import java.util.List;

public class IntFromString {
    public static void main(String[] args) {
//        метод принимает строку "1йцу2 ува5 вен4у5"
//        1)Посчитать сумму чисел
//        2)разделить на два массива с чётными и нечётными числами

        String input = "1йцу2 ува5 вен4у5";

        Result result = processingString(input);

        System.out.println("Сумма чисел = " + result.sum);
        System.out.println("Чётные числа : " + result.evenNum);
        System.out.println("Нечётные числа : " + result.oddNum);
    }
    public static Result processingString(String input){
        int sum = 0;
        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        for(char c : input.toCharArray()){
            if (Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                sum +=num;

                if (num % 2 == 0){
                    evenNum.add(num);
                }else{
                    oddNum.add(num);
                }
            }
        }
        return new Result(sum, evenNum, oddNum);
    }
}
class Result{
    int sum;
    List<Integer> evenNum;
    List<Integer> oddNum;

    public Result(int sum, List<Integer> evenNum, List<Integer> oddNum){
        this.sum = sum;
        this.evenNum = evenNum;
        this.oddNum = oddNum;
    }
}
