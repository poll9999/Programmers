package Level2;

import java.util.Stack;

public class 뒤에_있는_큰_수_찾기 {
    public static void main(String[] args) {
        int[] numbers1 = {2,3,3,5};
        int[] numbers2 = {9,1,5,3,6,2};
        for(int i=0; i<numbers1.length; i++) {
            System.out.println(solution(numbers1)[i]);
        }
        for(int i=0; i<numbers2.length; i++) {
            System.out.println(solution(numbers2)[i]);
        }
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        for(int i=1; i<numbers.length; i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
