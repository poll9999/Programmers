package Level2;

public class 일24_나라의_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        String answer = "";
        String[] numbers = {"4", "1", "2"};

        int num = n;
        int remainder;

        while(num > 0){
            remainder = num % 3;
            num /= 3;
            if(remainder == 0) {
                num--;
            }
            answer = numbers[remainder] + answer;
        }
        return answer;
    }
}
