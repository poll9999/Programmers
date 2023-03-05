package Level2;

public class 덧칠하기 {
    public static void main(String[] args) {
        int[] section1 = {2, 3, 6};
        int[] section2 = {1, 3};
        int[] section3 = {1, 2, 3, 4};
        System.out.println(solution(8, 4, section1));
        System.out.println(solution(5, 4, section2));
        System.out.println(solution(4, 1, section3));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] < max) {
                continue;
            }
            answer += 1;
            max = section[i] + m;
        }

        return answer;
    }
}
