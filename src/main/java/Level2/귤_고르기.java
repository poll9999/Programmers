package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 귤_고르기 {
    public static void main(String[] args) {
        int[] tangerine1 = {1, 3, 2, 5, 4, 5, 2, 3};
        int[] tangerine2 = {1, 1, 1, 1, 2, 2, 2, 3};

        System.out.println(solution(6, tangerine1));
        System.out.println(solution(4, tangerine1));
        System.out.println(solution(2, tangerine2));
    }
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0)+1);
        }

        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

        for(int key : listKeySet) {
            sum+=map.get(key);
            answer++;
            if(sum>=k){
                break;
            }
        }

        return answer;
    }
}
