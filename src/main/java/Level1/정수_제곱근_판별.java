package Level1;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    public static long solution(long n) {
        long answer = 0;
        double data= Math.sqrt(n);
        int result = (int) Math.sqrt(n);

        if (data == result) {
            answer= (long) Math.pow(data+1,2);
        }
        else{
            answer=-1;
        }

        return answer;
    }
}
