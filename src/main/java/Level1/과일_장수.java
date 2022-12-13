package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 과일_장수 {
    public static void main(String[] args) {
        int k=4;
        int m=3;
        int[] score= {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(k, m, score));

        int k1=3;
        int m1=4;
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(k1, m1, score1));
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        int count=0;
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        List<Integer> data;
        List<Integer> score2 = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            score2.add(score[i]);
        }
        Collections.sort(score2, Collections.reverseOrder());


        for(int i=0; i<score.length/m; i++){
            data=new ArrayList<>();
            for(int j=count; j<count+m; j++){
                data.add(score2.get(j));
            }
            count+=m;
            map.put(data, map.getOrDefault(data, 0)+1);
        }

        int min=0;

        for(List<Integer> key : map.keySet()){
            min=key.get(0);
            min*=key.size();
            min*=map.get(key);
            answer+=min;
        }
        return answer;
    }
}
