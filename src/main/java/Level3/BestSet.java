package Level3;


public class BestSet {
    public static void main(String[] args) {
        for(int i=0; i<solution(2,9).length; i++) {
            System.out.println(solution(2, 9)[i]);
        }
    }

    public static int[] solution(int n, int s) {
        int quotient = s/n;
        int remainder = s%n;
        int[] answer = new int[n];

        if(quotient == 0){
            return new int[]{-1};
        }

        for(int i = answer.length-1; i >= 0;i--){
            answer[i] = quotient;
            if(remainder > 0){
                answer[i]++;
                remainder--;
            }
        }

        return answer;
    }
}

