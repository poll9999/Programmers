package Level2;

import java.util.Arrays;

public class H_index {
    public static void main(String[] args) {
        int[] citations={4,4,4};
        /*
        System.out.println(solution(citations));
         */

        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int answer=0;
        Arrays.sort(citations);
        for(int i=citations[citations.length-1]; i>=0; i--) {
            if (checkIndex(citations, i)&& checkReverseIndex(citations, i)){
                answer=i;
                break;
            }
        }
        return answer;
    }

    public static boolean checkIndex(int[] citations, int h){
        int count=0;
        for(int i=0; i<citations.length; i++){
            if(citations[i]>=h){
                count++;
            }
        }
        if(count>=h){
            return true;
        }
        return false;
    }

    public static boolean checkReverseIndex(int[] citations, int h){
        int count=0;
        for(int i=0; i<citations.length; i++){
            if(citations[i]<h){
                count++;
            }
        }
        if(count<=h){
            return true;
        }
        return false;
    }
}
