package Level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 연속_부분_수열_합의_개수 {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(solution(elements));
    }

    public static int solution(int[] elements) {
        int answer = 0;
        int[] data = new int[elements.length * 2];

        for(int i = 0; i < elements.length; i++) {
            data[i] = data[i + elements.length] = elements[i];
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                set.add(Arrays.stream(data, j, j+i).sum());
            }
        }

        answer = set.size();
        return answer;
    }
}
