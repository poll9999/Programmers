package Level2;

import java.util.PriorityQueue;
import java.util.Queue;

public class 더_맵게_heap_refactor {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println(solution(scoville, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> data = new PriorityQueue<>();

        for (int i : scoville) {
            data.offer(i);
        }

        while (data.peek() <= K) {
            if (data.size() == 1) {
                return -1;
            }
            int a = data.poll();
            int b = data.poll();

            int result = a + (b * 2);

            data.offer(result);
            answer ++;
        }
        return answer;
    }
}
