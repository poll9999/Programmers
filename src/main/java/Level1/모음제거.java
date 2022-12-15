package Level1;

import java.util.ArrayList;
import java.util.List;

public class 모음제거 {
    public static void main(String[] args) {
        String a = "bus";
        String b = "nice to meet you";
        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    public static String solution(String my_string) {
        String answer = "";
        List<String> a = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            a.add(my_string.substring(i, i+1));
        }
        List<String> data = List.of("a", "e", "i", "o", "u");
        for (int i=0; i<data.size(); i++) {
            String c = data.get(i);
            a= (List<String>) a.stream().filter(b -> b !=c);
        }
        System.out.println(a);
        return answer;
    }
}
