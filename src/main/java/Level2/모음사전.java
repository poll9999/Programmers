package Level2;

public class 모음사전 {
    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
        System.out.println(solution("AAAE"));
        System.out.println(solution("I"));
        System.out.println(solution("EIO"));
    }

    public static int solution(String word) {
        int answer = 0;
        int index;
        String str = "AEIOU";
        int[] data = {781, 156, 31, 6, 1};

        answer+=word.length();
        for(int i=0;i<word.length();i++){
            index = str.indexOf(word.charAt(i));
            answer+=data[i]*index;
        }
        return answer;
    }
}
