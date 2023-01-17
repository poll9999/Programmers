package Level1;

public class 하샤드_수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int data = 0;
        int y=x;

        while(y!=0){
            data+=y%10;
            y/=10;
        }

        if (x%data!=0){
            answer=false;
        }

        return answer;
    }
}
