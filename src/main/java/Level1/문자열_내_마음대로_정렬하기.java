package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] strings1 = {"sun", "bed", "car"};
        String[] strings2 = {"abce", "abcd", "cdx"};
        for(int i=0; i<3; i++) {
            System.out.println(solution(strings1, 1)[i]);
        }
        for(int i=0; i<3; i++) {
            System.out.println(solution(strings2, 2)[i]);
        }
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> data = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            data.add("" + strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(data);
        answer = new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            answer[i] = data.get(i).substring(1, data.get(i).length());
        }
        return answer;
    }
}
