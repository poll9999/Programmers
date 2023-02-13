package Level2;

import java.util.HashMap;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes1));
        System.out.println(solution(clothes2));
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i =0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }

        answer++;
        for(String key : map.keySet()) {
            answer *=(map.get(key)+1);
        }

        answer -=1;
        return answer;
    }
}
