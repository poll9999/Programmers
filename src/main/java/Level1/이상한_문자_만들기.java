package Level1;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("abc  cde  "));
    }

    public static String solution(String s) {
        String answer = "";

        String[] data = s.split(" ");

        for(String a : data){
            for(int i=0; i<a.length(); i++){
                if (i%2==0){
                    answer+=a.substring(i, i+1).toUpperCase();
                }
                else{
                    answer+=a.substring(i, i+1).toLowerCase();
                }
            }
            answer+=" ";
        }
        answer=answer.substring(0, answer.length()-1);

        while(answer.length()!=s.length()) {
            answer += " ";
        }

        return answer;
    }
}
