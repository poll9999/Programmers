package Level2;

public class n진수_게임 {
    public static void main(String[] args) {
        System.out.println(solution(2, 4, 2, 1));
        System.out.println(solution(16, 16, 2, 1));
        System.out.println(solution(16, 16, 2, 2));
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int data = 0;

        while(sb.length() < m * t) {
            sb.append(Integer.toString(data++, n));
        }

        for(int i = p - 1; i < m * t; i = i + m) {
            result.append(sb.charAt(i));
        }

        answer = result.toString().toUpperCase();
        return answer;
    }
}
