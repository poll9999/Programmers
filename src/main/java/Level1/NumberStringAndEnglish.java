package Level1;

import java.util.List;

public class NumberStringAndEnglish {
    public static void main(String[] args) {

        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        int answer = 0;
        List<String> list=List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> string=List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        for(int i=0; i<string.size(); i++) {
            if (s.contains(string.get(i))){
                s=s.replace(string.get(i), list.get(i));
            }
        }
        answer= Integer.parseInt(s);
        return answer;
    }
}

