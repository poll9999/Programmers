package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의_전당1 {
    public static void main(String[] args) {
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        for(int i=0; i<score1.length; i++) {
            System.out.println(solution(3, score1)[i]);
        }
        for(int i=0; i<score2.length; i++) {
            System.out.println(solution(4, score2)[i]);
        }
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            data.add(score[i]);
            if (i >= k) {
                data.remove(Collections.min(data));
            }
            answer[i] = Collections.min(data);
        }

        return answer;
    }
}
