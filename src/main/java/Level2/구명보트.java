package Level2;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        int[] people1 = {70, 50, 80, 50};
        int[] people2 = {70, 50, 80};
        System.out.println(solution(people1, 100));
        System.out.println(solution(people2, 100));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for (int i = people.length - 1; i >= min; i--){
            if (people[min] + people[i] <= limit) {
                min++;
            }
            answer++;
        }

        return answer;
    }

}
