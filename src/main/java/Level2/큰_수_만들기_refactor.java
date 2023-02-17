package Level2;

public class 큰_수_만들기_refactor {
    public static void main(String[] args) {
        System.out.println(solution("1924", 2));
        System.out.println(solution("1231234", 3));
        System.out.println(solution("4177252841", 4));
    }

    public static String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int next = 0;

        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;

            for (int j = index; j <= i + k; j++) {
                int current = number.charAt(j) - '0';

                if (max < current) {
                    max = current;
                    next = j;
                }
            }
            sb.append(max);
            index = next + 1;
        }

        answer = sb.toString();
        return answer;
    }
}
