package Level2;

public class 피보나치_수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static int solution(int n) {
        int answer = 0;
        int[] data = new int[n+1];
        data[0]=0;
        data[1]=1;
        for(int i=2; i<=n; i++){
            data[i]=(data[i-1]+data[i-2])%1234567;
        }
        answer=data[n];
        return answer;
    }
}
