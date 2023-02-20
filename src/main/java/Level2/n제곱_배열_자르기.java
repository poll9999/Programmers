package Level2;

import java.util.ArrayList;
import java.util.List;

public class n제곱_배열_자르기 {
    public static void main(String[] args) {
        for(int i=0; i<solution(3, 2, 5).length; i++) {
            System.out.println(solution(3, 2, 5)[i]);
        }
        for(int i=0; i<solution(4, 7, 14).length; i++) {
            System.out.println(solution(4, 7, 14)[i]);
        }
    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = {};

        List<Long> list = new ArrayList<>();

        for(long i=left; i<right+1; i++){
            list.add(Math.max(i/n, i%n)+1);
        }

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]= Math.toIntExact(list.get(i));
        }

        return answer;
    }
}
