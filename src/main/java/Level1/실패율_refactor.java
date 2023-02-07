package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 실패율_refactor {
    public static void main(String[] args) {
        int[] stages1={2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages2={4,4,4,4,4};
        for(int i=0; i<solution(5, stages1).length; i++) {
            System.out.println(solution(5, stages1)[i]);
        }
        for(int i=0; i<solution(4, stages2).length; i++) {
            System.out.println(solution(4, stages2)[i]);
        }
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stage = new double[N+1];

        for(int i : stages){
            if(i == N+1){
                continue;
            }
            stage[i]++;
        }

        List<Double> data = new ArrayList<>();

        double num =stages.length;
        double tmp = 0;

        for(int i=1; i<stage.length; i++){
            tmp = stage[i];

            if(num == 0){
                stage[i]=0;
            }
            else{
                stage[i] = stage[i]/num;
                num = num - tmp;
            }

            data.add(stage[i]);
        }
        Collections.sort(data,Collections.reverseOrder());

        for(int i=0; i<data.size(); i++){
            for(int j=1; j<stage.length; j++){
                if(data.get(i) == stage[j]){
                    answer[i] = j;
                    stage[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}