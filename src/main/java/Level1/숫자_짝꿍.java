package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 숫자_짝꿍 {
    public static void main(String[] args) {
        String[] x = {"100", "100", "100", "12321", "5525"};
        String[] y = {"2345", "203045", "123450", "42531", "1255"};
        for(int i=0; i<x.length; i++){
            System.out.println(solution(x[i], y[i]));
        }
    }

    public static String solution(String X, String Y) {
        String answer = "";

        HashMap<String, Integer> xMap = new HashMap<>();
        HashMap<String, Integer> yMap = new HashMap<>();
        for (int i = 0; i < X.length(); i++) {
            xMap.put(X.substring(i, i + 1), xMap.getOrDefault(X.substring(i, i + 1), 0) + 1);
        }
        for (int i = 0; i < Y.length(); i++) {
            yMap.put(Y.substring(i, i + 1), yMap.getOrDefault(Y.substring(i, i + 1), 0) + 1);
        }

        int min;
        List<String> result = new ArrayList<>();
        for (String key : yMap.keySet()) {
            min = 0;
            if (xMap.containsKey(key)) {
                min = Math.min(xMap.get(key), yMap.get(key));
            }
            for (int i = 0; i < min; i++) {
                result.add(key);
            }
        }
        if (result.size() == 0) {
            return "-1";
        }
        Collections.sort(result, Collections.reverseOrder());
        if (result.get(0).equals("0")) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            stringBuilder.append(result.get(i));
        }
        answer = String.valueOf(stringBuilder);

        return answer;
    }
}