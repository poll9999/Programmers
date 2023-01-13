package Level1;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        for(int i=0; i<solution(12345).length; i++) {
            System.out.println(solution(12345)[i]);
        }
    }

    public static int[] solution(long n) {
        int[] answer = {};
        int count=0;
        long data=n;

        while(data!=0){
            data/=10;
            count++;
        }

        answer = new int[count];
        for(int i=0; i<count; i++){
            answer[i]= (int) (n%10);
            n/=10;
        }

        return answer;
    }
}
