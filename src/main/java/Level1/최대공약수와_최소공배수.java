package Level1;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        for(int i=0; i<2; i++) {
            System.out.println(solution(3, 12)[i]);
            System.out.println(solution(2, 5)[i]);
        }
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max=0;
        int min=0;

        if(n<m){
            for(int i=n; i>0; i--){
                if(n%i==0&&m%i==0){
                    max=i;
                    break;
                }
            }
            min=max*(n/max)*(m/max);
        }
        else if(n==m){
            max=n;
            min=n;
        }
        else{
            for(int i=m; i>0; i--){
                if(n%i==0&&m%i==0){
                    max=i;
                    break;
                }
            }
            min=max*(n/max)*(m/max);
        }

        answer[0] = max; answer[1]=min;
        return answer;
    }
}
