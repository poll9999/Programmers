package Level1;

import java.util.ArrayList;
import java.util.List;

public class PressKeyPad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        List<Integer> left = new ArrayList<>();
        left.add(10);
        List<Integer> right = new ArrayList<>();
        right.add(12);

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer+="L";
                left.add(numbers[i]);
            }
            else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                answer+="R";
                right.add(numbers[i]);
            }
            else{
                if(checkDistance(left.get(left.size()-1), numbers[i])>checkDistance(right.get(right.size()-1), numbers[i])){
                    answer+="R";
                    right.add(numbers[i]);
                }
                else if(checkDistance(left.get(left.size()-1), numbers[i])<checkDistance(right.get(right.size()-1), numbers[i])){
                    answer+="L";
                    left.add(numbers[i]);
                }
                else{
                    if(hand.equals("left")){
                        answer+="L";
                        left.add(numbers[i]);
                    }
                    else{
                        answer+="R";
                        right.add(numbers[i]);
                    }
                }

            }
        }


        return answer;
    }

    public static int checkDistance(int a, int b){
        if(a == 0){
            a=11;
        }
        if(b==0){
            b=11;
        }
        int data = Math.abs(a-b);
        int sum = data/3 + data%3;
        return sum;
    }
}
