import java.util.Arrays;

public class if5Even10 {
    //    Если каждое пятое число кратно 5, то все чётные умножить на 10
    public static void main(String[] args) {

        int[] arr = {1,2,15,4,25,6,7,10,30,12};
        int[] arr2 = {1,2,15,4,25,6,7,10,30,12};

        boolean ifFifth = true;
        for (int i = 4; i < args.length; i += 5){
            if (arr[i] % 5 != 0){
                ifFifth = false;
                break;
            }
        }
        if (ifFifth){
            for (int i = 0; i < arr.length; i++){
                if(arr[i] % 2 == 0){
                    arr[i] *= 10;
                }
            }
        }
        System.out.println("Результат1: " + Arrays.toString(arr));
    }
}
