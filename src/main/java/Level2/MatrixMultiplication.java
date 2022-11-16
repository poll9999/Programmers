package Level2;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1={{2,3,2}, {4,2,4}, {3,1,4}};
        int[][] arr2={{5,4,3},{2,4,1},{3,1,1}};

        for(int i=0; i<solution(arr1, arr2).length; i++) {
            for(int j=0; j<solution(arr1, arr2)[0].length; j++) {
                System.out.println(solution(arr1, arr2)[i][j]);
            }
        }
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer=new int[arr1.length][arr2[0].length];
        int result=0;

        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                answer[i][j]=makeIndex(arr1, arr2, i, j);
            }
        }



        return answer;
    }

    public static int makeIndex(int[][] arr1, int[][] arr2, int a, int b){
        int result=0;
        for(int i=0; i<arr1[0].length; i++) {
            result+=arr1[a][i] * arr2[i][b];
        }
        return result;
    }
}