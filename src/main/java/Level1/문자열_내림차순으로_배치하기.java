package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        String REGEX =  "^[A-Z]*$";
        String answer = "";
        List<String> small = new ArrayList<>();
        List<String> big = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if (!s.substring(i, i+1).matches(REGEX)){
                small.add(s.substring(i, i+1));
            }
            else{
                big.add(s.substring(i, i+1));
            }
        }

        Collections.sort(small, Collections.reverseOrder());
        Collections.sort(big, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<small.size(); i++){
            sb.append(small.get(i));
        }
        for(int i=0; i<big.size(); i++){
            sb.append(big.get(i));
        }

        answer= String.valueOf(sb);
        return answer;
    }
}
