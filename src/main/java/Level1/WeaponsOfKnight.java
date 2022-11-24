package Level1;

import java.util.ArrayList;
import java.util.List;

public class WeaponsOfKnight {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
    }

    public static int solution(int number, int limit, int power) {
        List<Integer> ab=new ArrayList<>();
        int answer=0;
        for(int i=1; i<=number; i++){
            if(DivisiorCount(i)<=limit) {
                ab.add(DivisiorCount(i));
            }
            else{
                ab.add(power);
            }
        }
        for(int i=0; i<ab.size(); i++){
            answer+=ab.get(i);
        }
        return answer;
    }

    public static int DivisiorCount(int number){
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) count++;
            else if (number % i == 0) count += 2;
        }

        return count;
    }
}
