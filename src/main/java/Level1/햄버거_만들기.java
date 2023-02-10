package Level1;

import java.util.Stack;

public class 햄버거_만들기 {
    public static void main(String[] args) {
        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(ingredient1));
        System.out.println(solution(ingredient2));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> data = new Stack<>();

        for(int i : ingredient){
            data.push(i);

            if (data.size()>=4){
                if (data.get(data.size()-4)==1 && data.get(data.size()-3)==2 && data.get(data.size()-2)==3 && data.get(data.size()-1)==1) {
                    answer++;
                    for(int a=0; a<4; a++){
                        data.pop();
                    }
                }
            }
        }

        return answer;
    }
}
