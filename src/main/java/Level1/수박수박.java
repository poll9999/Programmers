package Level1;

public class 수박수박 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        String answer = "";

        if (n%2==1){
            answer+="수박".repeat(n/2);
            answer+="수";
        }
        else{
            answer+="수박".repeat(n/2);
        }

        return answer;
    }
}
