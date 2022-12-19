package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K번째_수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        for(int i=0; i<commands.length; i++) {
            System.out.println(solution(array, commands)[i]);
        }
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> data;
        for(int i=0; i<commands.length; i++) {
            data=new ArrayList<>();
            for (int k = commands[i][0] - 1; k <= commands[i][1] - 1; k++) {
                data.add(array[k]);
            }
            Collections.sort(data);
            answer[i]=data.get(commands[i][2]-1);
        }

        return answer;
    }
}
