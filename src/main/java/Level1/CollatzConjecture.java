package Level1;

public class CollatzConjecture {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int answer=0;
        long number=num;
        while(number!=1){
            if(number%2==0){
                number/=2;
                answer++;
            }
            else {
                number = number * 3 + 1;
                answer++;
            }
            if (answer==500){
                answer=-1;
                break;
            }
        }
        return answer;
    }
}
