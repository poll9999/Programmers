package Level1;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        String answer = "";
        int data = 0;

        for(int i=0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")){
                data=i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ").append(data).append("에 있다");
        answer= String.valueOf(sb);

        return answer;
    }
}
