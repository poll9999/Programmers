package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }

    public static String solution(String s) {
        String answer = "";

        List<Integer> data = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            data.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(data);
        answer=data.get(0)+" "+data.get(data.size()-1);

        return answer;
    }
}
