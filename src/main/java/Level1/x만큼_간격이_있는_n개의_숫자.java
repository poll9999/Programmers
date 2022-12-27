package Level1;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        for(int i=0; i<solution(2, 5).length; i++) {
            System.out.println(solution(2, 5)[i]);
        }
        for(int i=0; i<solution(4, 3).length; i++) {
            System.out.println(solution(4, 3)[i]);
        }
        for(int i=0; i<solution(-4, 2).length; i++) {
            System.out.println(solution(-4, 2)[i]);
        }
    }

    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        long data=x;

        for(int i=0; i<n; i++){
            answer[i]=data;
            data+=x;
        }

        return answer;
    }
}
