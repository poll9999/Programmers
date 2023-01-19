package Level1;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        String answer = "";

        answer+="*".repeat(phone_number.length()-4);
        answer+=phone_number.substring(phone_number.length()-4);

        return answer;
    }
}
