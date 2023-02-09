package Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발_refactor {
    public static void main(String[] args) {
        int[] progresses1 = {93, 39, 55};
        int[] speeds1 = {1, 30, 5};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        for(int i=0; i<solution(progresses1, speeds1).length; i++) {
            System.out.println(solution(progresses1, speeds1)[i]);
        }
        for(int i=0; i<solution(progresses2, speeds2).length; i++) {
            System.out.println(solution(progresses2, speeds2)[i]);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        List<Integer> data = new ArrayList<>();
        while (!queue.isEmpty()){
            int day = queue.poll();
            int count = 1;

            while(!queue.isEmpty() && (day >= queue.peek())){
                count++;
                queue.poll();
            }
            data.add(count);
        }

        answer = new int[data.size()];
        for(int i=0; i<data.size(); i++){
            answer[i]=data.get(i);
        }

        return answer;
    }
}
