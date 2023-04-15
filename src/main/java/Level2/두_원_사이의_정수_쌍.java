package Level2;

public class 두_원_사이의_정수_쌍 {
    public static void main(String[] args) {
        System.out.print(solution(2, 3));
    }

    public static long solution(int r1, int r2) {
        long answer = 0;

        long newR1 = (long) Math.pow(r1, 2);
        long newR2 = (long) Math.pow(r2, 2);
        long side = 0;

        for (long i = 0; i <= r2; i++) {
            long a = (long) Math.sqrt(newR2 - (long) Math.pow(i, 2));
            long b = (long) Math.sqrt(newR1 - (long) Math.pow(i, 2));

            if (Math.sqrt((newR1 - Math.pow(i, 2))) % 1 == 0) {
                side++;
            }

            answer += (a - b) * 4;
        }

        answer += side * 4 - 4;
        return answer;
    }
}
