package PCCP_Test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class 외톨이_알파벳_refactor {
    public static void main(String[] args) {
        System.out.println(solution("edeaaabbccd"));
        System.out.println(solution("eeddee"));
        System.out.println(solution("string"));
        System.out.println(solution("zbzbz"));
    }

    public static String solution(String input_string) {
        String answer = "";

        HashMap<Character,Boolean> map = new HashMap<>();
        Set<Character> set = new TreeSet<>();
        char[] data= input_string.toCharArray();

        char word=' ';

        for(char a : data){
            if(word!=a){
                if(map.containsKey(a)){
                    set.add(a);
                }
                map.put(a,true);
                word=a;
            }
        }

        for(char a : set){
            answer+=a;
        }

        if(answer==""){
            return "N";
        }

        return answer;
    }
}
