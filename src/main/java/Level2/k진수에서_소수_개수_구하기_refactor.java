package Level2;

public class k진수에서_소수_개수_구하기_refactor {
    public static void main(String[] args) {
        System.out.println(solution(437674, 3));
        System.out.println(solution(110011, 10));
    }

    public static int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        String[] data = s.split("0");

        for(String a : data){
            if(a.equals("")) {
                continue;
            }
            long number = Long.parseLong(a);
            if(checkPrime(number)){
                answer++;
            }
        }
        return answer;
    }

    public static boolean checkPrime(long number){
        if(number == 1){
            return false;
        }

        if(number == 2) {
            return true;
        }

        for(int i=2; i<=(int)Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
