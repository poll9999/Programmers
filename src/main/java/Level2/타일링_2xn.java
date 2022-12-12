package Level2;

public class 타일링_2xn {
    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(6));
    }
    public static int solution(int n) {
        int answer=0;

        int[] data = new int[n];
        data[0]=1;
        data[1]=2;
        int num;

        for(int i=2; i<n; i++){
            num=data[i-1]+data[i-2];
            data[i]=num%1000000007;
        }
        answer=data[n-1];

        return answer;
    }
}
