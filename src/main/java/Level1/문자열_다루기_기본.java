package Level1;

public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }

    public static boolean solution(String s) {
        String REGEX = "^[0-9]$";
        boolean answer = true;

        if (s.length()!=4 && s.length()!=6){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            if (!s.substring(i, i+1).matches(REGEX)){
                return false;
            }
        }

        return answer;
    }
}
