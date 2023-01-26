package Level2;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
    }

    public static String solution(String s) {
        String answer = "";

        String[] data = s.split(" ");

        for(int i=0; i<data.length; i++) {
            String string = data[i];

            if(data[i].length() == 0) {
                answer += " ";
            }

            else {
                answer += string.substring(0, 1).toUpperCase();
                answer += string.substring(1, string.length()).toLowerCase();
                answer += " ";
            }

        }
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }

        return answer.substring(0, answer.length()-1);
    }
}
