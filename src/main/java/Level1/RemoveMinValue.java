package Level1;


import java.util.Arrays;

public class RemoveMinValue {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        for(int i=0; i<solution(arr).length; i++){
            System.out.println(solution(arr)[i]);
        }
    }

    public static int[] solution(int[] arr) {
        int[] answer = arr;
        int a= Integer.MAX_VALUE;

        for(int i=0; i<answer.length; i++){
            a=Math.min(a, answer[i]);
        }

        if(answer.length==1){
            answer= new int[]{-1};
        }
        else{
            answer=removeElement(answer, a);
        }
        return answer;
    }

    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
}
