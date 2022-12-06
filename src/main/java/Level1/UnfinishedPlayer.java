package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class UnfinishedPlayer {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.print(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String key : participant) {
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for(String key : completion) {
            map.put(key, map.getOrDefault(key, 0)-1);
        }

        for (String key : map.keySet()){
            if(map.get(key)==1){
                answer=key;
            }
        }
        return answer;
    }
}
