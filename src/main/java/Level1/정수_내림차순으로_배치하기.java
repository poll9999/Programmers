package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        long answer = 0;
        long digit = 1;

        List<Long> data = new ArrayList<>();
        while(n!=0){
            data.add(n%10);
            n/=10;
        }
        Collections.sort(data);

        for(int i=0; i<data.size(); i++){
            answer+=data.get(i)*digit;
            digit*=10;
        }

        return answer;
    }
}
