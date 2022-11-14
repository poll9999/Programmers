package Level2;

public class RepeatBinaryTrans {
    public static void main(String[] args) {
        String s="1111111";
        for(int i=0; i<solution(s).length; i++) {
            System.out.print(solution(s)[i]);
        }
    }
    public static int[] solution(String s) {
        int count=0;
        int delete=0;
        while(!s.equals("1")){
            delete+=CountTrans(s);
            s=AfterTrans(trans(s));
            count++;
        }
        int[] answer = {count, delete};
        return answer;
    }

    public static String trans(String s){
        if(s.contains("1")){
            s=s.replaceAll("0", "");
        }
        return s;
    }

    public static int CountTrans(String s){
        int b=s.length();
        int a=trans(s).length();
        return (b-a);
    }

    public static String AfterTrans(String s){
        int a=s.length();
        String y=Integer.toBinaryString(a);
        return y;
    }
}
