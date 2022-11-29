package Level1;

public class FoodFighterContest {
    public static void main(String[] args) {
        int[] food = {1,7,1,2};
        System.out.println(solution(food));
    }

    public static String solution(int[] food) {
        String answer = "";

        for(int i=1; i<food.length; i++){
            answer+=String.valueOf(i).repeat(food[i]/2);
        }

        String data = ReverseString(answer);

        answer+="0";
        answer+=data;

        return answer;
    }

    public static String ReverseString(String answer){
        StringBuffer sb = new StringBuffer(answer);
        answer = sb.reverse().toString();
        return answer;
    }
}
