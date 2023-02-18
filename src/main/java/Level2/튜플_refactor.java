package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 튜플_refactor {
    public static void main(String[] args) {
        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        String s3 = "{{20,111},{111}}";
        String s4 = "{{123}}";
        String s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        for(int i=0; i<solution(s1).length; i++) {
            System.out.println(solution(s1)[i]);
        }
        for(int i=0; i<solution(s2).length; i++) {
            System.out.println(solution(s2)[i]);
        }
        for(int i=0; i<solution(s3).length; i++) {
            System.out.println(solution(s3)[i]);
        }
        for(int i=0; i<solution(s4).length; i++) {
            System.out.println(solution(s4)[i]);
        }
        for(int i=0; i<solution(s5).length; i++) {
            System.out.println(solution(s5)[i]);
        }
    }

    public static int[] solution(String s) {
        int[] answer = {};
        s = s.replaceAll("[\\{,\\}]", " ");
        String[] data = s.split("[ ]+");
        HashMap<String, Integer> map = new HashMap<>();


        for(int i = 0; i < data.length; i++){
            if (!data[i].equals("")){
                if (map.containsKey(data[i])){
                    map.replace(data[i], map.get(data[i]) + 1);
                }else{
                    map.put(data[i], 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {return o2.getValue().compareTo(o1.getValue());});
        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(list.get(i).getKey());
        }

        return answer;
    }
}
