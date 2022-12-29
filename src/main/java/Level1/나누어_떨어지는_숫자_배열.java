package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        for(int i=0; i<solution(new int[]{5, 9, 7, 10}, 5).length; i++) {
            System.out.println(solution(new int[]{5, 9, 7, 10}, 5)[i]);
        }
        for(int i=0; i<solution(new int[]{2, 36, 1, 3}, 1).length; i++) {
            System.out.println(solution(new int[]{2, 36, 1, 3}, 1)[i]);
        }
        for(int i=0; i<solution(new int[]{3, 2, 6}, 10).length; i++) {
            System.out.println(solution(new int[]{3, 2, 6}, 10)[i]);
        }
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count=0;
        List<Integer> data = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if (arr[i]%divisor==0){
                data.add(arr[i]);
                count++;
            }
        }

        if (count==0){
            return new int[]{-1};
        }

        Collections.sort(data);
        answer = new int[count];
        for(int i=0; i<count; i++){
            answer[i]=data.get(i);
        }

        return answer;
    }
}
