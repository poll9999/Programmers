package Level1;

public class MinSquare {
    public static void main(String[] args) {
        int[][] sizes1={{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2={{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3={{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution(sizes1));
        System.out.println(solution(sizes2));
        System.out.println(solution(sizes3));
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        int max= Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        int[] result=new int[sizes.length];

        for(int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[0].length; j++){
                max=Math.max(max, sizes[i][j]);
            }
        }

        for(int i=0; i<sizes.length; i++){
            result[i]=Math.min(sizes[i][0], sizes[i][1]);
            min=Math.max(min, result[i]);
        }
        answer=max*min;

        return answer;
    }
}