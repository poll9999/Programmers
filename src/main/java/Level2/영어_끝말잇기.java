package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어_끝말잇기 {
    public static void main(String[] args) {
        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};

        for(int i=0; i<solution(3, words1).length; i++) {
            System.out.println(solution(3, words1)[i]);
        }

        for(int i=0; i<solution(5, words2).length; i++) {
            System.out.println(solution(5, words2)[i]);
        }

        for(int i=0; i<solution(2, words3).length; i++) {
            System.out.println(solution(2, words3)[i]);
        }

        System.out.println(Arrays.stream(words1).distinct().count());
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        boolean flag = true;

        for(int i=0; i<words.length; i++){
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || list.contains(words[i])){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
            list.add(words[i]);
        }
        if(flag)
            return new int[]{0, 0};
        return answer;
    }
}