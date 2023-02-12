package Level1;

public class 문자열_나누기_refactor {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
        System.out.println(solution("aaabbaccccabba"));
    }

    public static int solution(String s) {
        char data = s.charAt(0);
        int exist = 0;
        int notExist = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (exist == notExist) {
                answer++;
                data = s.charAt(i);
            }
            if (data == s.charAt(i)){
                exist++;
            }
            else {
                notExist++;
            }
        }
        return answer;
    }
}
