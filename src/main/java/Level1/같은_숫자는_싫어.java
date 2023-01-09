package Level1;

import java.util.Stack;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        for(int i=0; i<solution(arr1).length; i++) {
            System.out.println(solution(arr1)[i]);
        }
        for(int i=0; i<solution(arr2).length; i++) {
            System.out.println(solution(arr2)[i]);
        }
    }
    public static int[] solution(int[] arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            if (stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];

        for(int i=0; i<stack.size(); i++){
            answer[i]=stack.get(i);
        }

        return answer;
    }
}
