package Level2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프린터_refactor {
    public static void main(String[] args) {
        int[] priorities1 = {2, 1, 3, 2};
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(priorities1, 2));
        System.out.println(solution(priorities2, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> data = new PriorityQueue<>(Collections.reverseOrder());

        for(int a : priorities){
            data.add(a);
        }

        while(!data.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(data.peek() == priorities[i]){
                    data.poll();
                    answer++;
                    if(location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
