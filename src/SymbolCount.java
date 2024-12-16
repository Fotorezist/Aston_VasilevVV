import java.util.HashMap;
import java.util.Map;

public class SymbolCount {
    public static void main(String[] args) {
//        Создать строку "Hello world!" и вывести символы и их количество в ней

        String str = "Hello word!";
        char [] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character s : chars){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);
    }
}
