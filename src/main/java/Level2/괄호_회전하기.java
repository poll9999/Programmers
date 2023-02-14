package Level2;

import java.util.Stack;

public class 괄호_회전하기 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
        System.out.println(solution("}}}"));
    }

    public static int solution(String s) {
        int answer = 0;
        String data = s;

        for(int i = 0; i < s.length(); i++){
            if(check(data)) {
                answer++;
            }
            data = data.substring(1, s.length()) + data.charAt(0);
        }
        return answer;
    }

    public static boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            try{
                switch(s.charAt(i)){
                    case '[':
                        stack.add('[');
                        break;
                    case ']':
                        if(stack.peek() != '[') return false;
                        stack.pop();
                        break;
                    case '{':
                        stack.add('{');
                        break;
                    case '}':
                        if(stack.peek() != '{') return false;
                        stack.pop();
                        break;
                    case '(':
                        stack.add('(');
                        break;
                    case ')':
                        if(stack.peek() != '(') return false;
                        stack.pop();
                        break;
                }
            } catch(Exception e){
                return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}