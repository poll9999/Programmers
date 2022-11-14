package Level2;

public class NextBigNumber {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = n+1;
        while(!transformBinary(n, answer)){
            answer++;
        }
        return answer;
    }

    public static boolean transformBinary(int n, int a){
        if(Integer.bitCount(n)==Integer.bitCount(a)){
            return true;
        }
        return false;
    }
}