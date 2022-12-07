package Level2;

import java.util.HashMap;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] a = {"119", "97674223", "1195524421"};
        String[] b = {"123","456","789"};
        String[] c = {"12","123","1235","567","88"};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));

    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], "prefix");
        }

        for(String s : phone_book) {
            for(int i = 1; i < s.length(); i++) {
                if(map.containsKey(s.substring(0, i))) {
                    System.out.println(map);
                    return false;
                }
            }
        }
        System.out.println(map);


        return answer;
    }
}
