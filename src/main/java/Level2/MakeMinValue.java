package Level2;

import java.util.Arrays;

public class MakeMinValue {
    public static void main(String[] args) {
        int[] A={1,2};
        int[] B={3, 4};
        System.out.println(solution(A, B));
    }

    public static int solution(int []A, int []B)
    {
        int answer = 0;
        int terms=0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<B.length/2; i++){
            terms=B[i];
            B[i]=B[B.length-i-1];
            B[B.length-i-1]=terms;
        }
        for(int i=0; i<A.length; i++){
            answer+=A[i]*B[i];
        }
        System.out.println("Hello Java");

        return answer;
    }
}