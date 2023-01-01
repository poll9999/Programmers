package Level1;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if(a<b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }

        else if(a==b){
            answer=a;
        }

        else{
            for (int i = b; i <= a; i++){
                answer += i;
            }
        }

        return answer;
    }
}
