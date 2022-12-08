package Level1;

import java.util.ArrayList;
import java.util.List;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        for(int i=0; i<solution("banana").length; i++) {
            System.out.println(solution("banana")[i]);
        }
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        List<String> data = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if (!data.contains(s.substring(i, i+1))){
                answer[i]=-1;
            }
            else{
                answer[i]=i-checkList(data, s.substring(i, i+1));
            }
            data.add(s.substring(i, i+1));
        }
        return answer;
    }

    public static int checkList(List<String> data, String s){
        int result=0;
        for(int i=0; i<data.size(); i++){
            if (data.get(i).equals(s)){
                result=i;
            }
        }
        return result;
    }
}
