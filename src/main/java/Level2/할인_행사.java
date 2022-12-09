package Level2;

import java.util.HashMap;

public class 할인_행사 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        String[] want1 = {"apple"};
        int[] number1 = {10};
        String[] discount1 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        System.out.println(solution(want, number, discount));
        System.out.println(solution(want1, number1, discount1));

    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        for(int i=0; i<discount.length-9; i++){
            if (map.equals(checkNumber(discount, i))){
                answer++;
            }
        }

        return answer;
    }

    public static HashMap<String, Integer> checkNumber(String[] discount, int count){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=count; i<count+10; i++){
            map.put(discount[i], map.getOrDefault(discount[i], 0)+1);
        }
        return map;
    }
}
