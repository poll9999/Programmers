package Level1;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        String answer = "";

        if (s.length()%2==1){
            answer+=s.substring(s.length()/2, s.length()/2+1);
        }
        else{
            answer+=s.substring(s.length()/2-1, s.length()/2+1);
        }

        return answer;
    }
}
