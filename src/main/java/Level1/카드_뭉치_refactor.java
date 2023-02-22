package Level1;

public class 카드_뭉치_refactor {
    public static void main(String[] args) {
        String[] cards11 = {"i", "drink", "water"};
        String[] cards21 = {"want", "to"};
        String[] cards31 = {"i", "want", "to", "drink", "water"};
        String[] cards12 = {"i", "water", "drink"};
        String[] cards22 = {"want", "to"};
        String[] cards32 = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards11, cards21, cards31));
        System.out.println(solution(cards12, cards22, cards32));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int first = 0;
        int second = 0;

        for (int i = 0; i < goal.length; i++) {
            String data = goal[i];
            if (first < cards1.length && data.equals(cards1[first])) {
                first++;
            } else if (second < cards2.length && data.equals(cards2[second])) {
                second++;
            } else {
                return "No";
            }
        }
        return answer;
    }
}
