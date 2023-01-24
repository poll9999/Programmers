package Level1;

public class 시저_암호 {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)) { //소문자
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(ch)) { //대문자
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }

            answer += ch;
        }

        return answer;
    }
}
