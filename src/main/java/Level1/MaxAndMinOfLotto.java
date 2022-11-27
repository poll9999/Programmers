package Level1;

import java.util.Arrays;

public class MaxAndMinOfLotto {
    public static void main(String[] args) {
        int[] lottos={0, 0, 0, 0, 0, 0};
        int[] win_nums={38, 19, 20, 40, 15, 25};
        for(int i=0; i<2; i++) {
            System.out.println(solution(lottos, win_nums)[i]);
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int count=0;
        for(int i=0; i<win_nums.length; i++){
            int data=lottos[i];
            if(Arrays.stream(win_nums).anyMatch(a->a==data)){
                count++;
            }
        }
        int correct= (int) Arrays.stream(lottos).filter(a->a==0).count();
        int left=7-count-correct;
        if(left>6){
            left=6;
        }
        int right=7-count;
        if(right>6){
            right=6;
        }
        int[] answer={left, right};
        return answer;
    }
}
