package Level2;

import java.util.ArrayList;
import java.util.List;

public class 캐시_refactor {
    public static void main(String[] args) {
        String[] cities1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        String[] cities2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        String[] cities3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        String[] cities4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        String[] cities5 = {"Jeju", "Pangyo", "NewYork", "newyork"};
        String[] cities6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        System.out.println(solution(3, cities1));
        System.out.println(solution(3, cities2));
        System.out.println(solution(2, cities3));
        System.out.println(solution(5, cities4));
        System.out.println(solution(2, cities5));
        System.out.println(solution(0, cities6));
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if (cacheSize == 0){
            return cities.length*5;
        }

        List<String> data = new ArrayList<>();
        for(int i=0; i<cities.length; i++){
            String s = cities[i].toUpperCase();
            if (data.remove(s)){
                answer+=1;
                data.add(s);
            }
            else {
                answer+=5;
                if (data.size()>=cacheSize){
                    data.remove(0);
                }
                data.add(s);
            }
        }

        return answer;
    }
}
