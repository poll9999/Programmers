package Level2;

public class 타겟_넘버_dfs_refactor {
    public static void main(String[] args) {
        int[] numbers1 = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};
        System.out.println(solution(numbers1, 3));
    }
    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    public static void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(target == sum) {
                answer++;
            }
        }
        else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }
}
