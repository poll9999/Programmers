package Level2;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        /*
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));

         */
    }
    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        if (s.charAt(0)==')')
            return false;

        for(int i=0; i<s.length(); i++){
            if (!stack.isEmpty() && s.charAt(i) == ')'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
            System.out.println(stack);
        }

        if (stack.isEmpty()){
            answer=true;
        }
        else answer = false;

        return answer;
    }
}
