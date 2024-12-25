import java.util.*;
import java.util.stream.IntStream;

public class MergeTwoArrays {
    // Объединить 2 несортированных массива в один сортированный, удалив дубликаты

    public static void main(String[] args) {
        int[] a = new int[]{1,5,7,8,6,1,4,8,5,3,4,2};
        int[] b = new int[]{5,6,8,7,2,9,1,3,7,8,5,1,4,9,6,2,5,8};
                int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                        .sorted()
                        .distinct()
                        .toArray();
        System.out.println(Arrays.toString(c));

        //Без stream
        int[] ab = new int[a.length + b.length];
        System.arraycopy(a, 0, ab,0, a.length);
        System.arraycopy(b, 0, ab,a.length, b.length);

        Set<Integer> set = new HashSet<>();
        for (int num : ab){
            set.add(num);
        }
        Integer[] uniqAb = set.toArray(new Integer[0]);
        Arrays.sort(uniqAb);

//        System.out.println(Arrays.toString(uniqAb));
        //Преобразование Integer в int
        int[] resAb = new int[uniqAb.length];
        for (int i = 0; i < uniqAb.length; i++){
            resAb[i] = uniqAb[i];
        }
        System.out.println(Arrays.toString(resAb));
    }
}
