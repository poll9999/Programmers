package Level2;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        for(int i=0; i<solution(answers1).length; i++) {
            System.out.println(solution(answers1)[i]);
        }
        for(int i=0; i<solution(answers2).length; i++) {
            System.out.println(solution(answers2)[i]);
        }
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int aCount =0;
        int bCount =0;
        int cCount =0;

        for(int i=0; i<answers.length; i++){
            if (answers[i]==a[i%a.length]){
                aCount++;
            }
            if (answers[i]==b[i%b.length]){
                bCount++;
            }
            if (answers[i]==c[i%c.length]){
                cCount++;
            }
        }

        List<Integer> data = List.of(aCount, bCount, cCount);
        List<Integer> result = new ArrayList<>();
        int max=0;
        max=Math.max(aCount, bCount);
        max=Math.max(cCount, max);
        for(int i=0; i<data.size(); i++){
            if (max==data.get(i)){
                result.add(i+1);
            }
        }
        answer=new int[result.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=result.get(i);
        }

        return answer;
    }
}
