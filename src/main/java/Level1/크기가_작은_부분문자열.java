package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

    public static int solution(String t, String p) {
        int answer = 0;

        List<String> data = new ArrayList<>();
        int result=0;
        for(int i=0; i<t.length()-p.length()+1; i++){
            data.add(t.substring(i, i+p.length()));
        }
        data.add(p);
        Collections.sort(data, Collections.reverseOrder());
        for(int i=0; i<data.size(); i++){
            if (data.get(i).equals(p)){
                result=i;
                break;
            }
        }
        answer=data.size()-result-1;

        return answer;
    }
}
