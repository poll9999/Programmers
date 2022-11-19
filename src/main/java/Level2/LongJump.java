package Level2;

public class LongJump {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static long solution(int n) {
        long[] memo = new long[2001];
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3; i <= n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }

        return memo[n];
    }
}