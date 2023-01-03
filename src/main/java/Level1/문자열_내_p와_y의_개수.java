package Level1;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        int pCount=0;
        int yCount=0;
        char data;

        for(int i=0; i<s.length(); i++){
            data = s.charAt(i);
            if (data == 'p' || data == 'P'){
                pCount++;
            }
            if (data == 'y' || data == 'Y') {
                yCount++;
            }
        }

        if (pCount!=yCount){
            answer=false;
        }

        return answer;
    }
}
