package Level2;

import java.util.ArrayList;
import java.util.List;

public class Carpet {
    public static void main(String[] args) {

        for(int i=0; i<solution(8, 1).length; i++) {
            System.out.println(solution(8, 1)[i]);
        }
    }
    public static int[] solution(int brown, int yellow) {
        int count=0;
        int a=small(brown+yellow).get(count);

        while(0!=2*a*a-a*(brown+4)+2*(brown+yellow)){
            count++;
            a=small(brown+yellow).get(count);
        }
        int[] answer={a, (brown+yellow)/a};
        return answer;
    }

    public static List<Integer> small(int a){
        List<Integer> list=new ArrayList<>();
        for(int i=a; i>0; i--){
            if(a%i==0){
                list.add(i);
            }
        }
        return list;
    }
}
