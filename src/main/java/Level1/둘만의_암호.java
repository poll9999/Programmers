package Level1;

public class 둘만의_암호 {
    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";

        char[] data = s.toCharArray();
        for(int i=0; i<data.length; i++){
            for (int j=0; j<index; j++){
                data[i]++;
                if(data[i] > 'z'){
                    data[i] -= 26;
                }
                while (skip.contains(String.valueOf(data[i]))){
                    data[i]++;
                    if(data[i] > 'z'){
                        data[i] -= 26;
                    }
                }
            }
        }

        answer = String.valueOf(data);

        return answer;
    }
}
