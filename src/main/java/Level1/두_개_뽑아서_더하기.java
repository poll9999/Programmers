package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers1= {2,1,3,4,1};
        int[] numbers2= {5,0,2,7};
        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        answer = new int[set.size()];
        int count=0;
        List<Integer> result = new ArrayList<>();
        for(int a : set){
            result.add(a);
        }
        Collections.sort(result);
        for(int i=0; i<set.size(); i++){
            answer[i]=result.get(i);
        }

        return answer;
    }
}
