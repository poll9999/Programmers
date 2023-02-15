package Level2;

import java.util.Arrays;

public class 가장_큰_수 {
    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        String[] data = new String[numbers.length];

        for (int i = 0; i < data.length; i++) {
            data[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(data, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (data[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
        }

        answer = sb.toString();
        return answer;
    }
}
