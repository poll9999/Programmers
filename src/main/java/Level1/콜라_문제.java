package Level1;

public class 콜라_문제 {
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
        System.out.println(solution(3,1,20));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int remainder = 0;

        while(n>=a){
            answer += (n/a) * b;
            remainder = n%a;
            n=(n/a)*b + remainder;
        }

        return answer;
    }
}
