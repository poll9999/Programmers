package Level2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }

    public static int solution(String s) {
        int answer = -1;
        char[] carr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<carr.length;i++) {
            char c = carr[i];

            if (stack.empty()) {
                stack.push(c);
            }
            else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        if (stack.empty()){
            answer=1;
        }
        else answer=0;

        return answer;
    }
}
