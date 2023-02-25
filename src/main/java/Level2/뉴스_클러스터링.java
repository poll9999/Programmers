package Level2;

import java.util.ArrayList;
import java.util.List;

public class 뉴스_클러스터링 {
    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french"));
        System.out.println(solution("handshake", "shake hands"));
        System.out.println(solution("aa1+aa2", "AAAA12"));
        System.out.println(solution("E=M*C^2", "e=m*c^2"));
    }

    public static int solution(String str1, String str2){
        int answer = 0;

        List<String> data1 = new ArrayList<>();
        List<String> data2 = new ArrayList<>();
        List<String> union = new ArrayList<>();
        List<String> inter = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i = 0; i<str1.length()-1;i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            if(first >='a' && first <='z' && second >='a' && second <='z'){
                data1.add(first +""+second);
            }
        }

        for(int i = 0; i<str2.length()-1;i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            if(first >='a' && first <='z' && second >='a' && second <='z'){
                data2.add(first +""+second);
            }
        }

        for(String s : data1){
            if(data2.remove(s)){
                union.add(s);
            }
            inter.add(s);
        }

        inter.addAll(data2);

        double union_size = union.size();
        double inter_size = inter.size();

        if(inter_size == 0){
            return 65536;
        }

        answer = (int)(union_size/inter_size* 65536) ;
        return answer;
    }
}