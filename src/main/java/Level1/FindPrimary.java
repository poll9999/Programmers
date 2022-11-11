package Level1;

import java.util.ArrayList;
import java.util.List;

public class FindPrimary {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums) {
        int answer = -1;
        List<Integer> sum=new ArrayList<>();
        for(int i=2; i<nums.length; i++){
            for(int j=1; j<i; j++){
                for(int k=0; k<j; k++){
                    sum.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        List<Integer> newList=new ArrayList<>();
        for(int i=0; i<sum.size(); i++){
            for(int j=2; j<sum.get(i); j++){
                if(sum.get(i)%j==0){
                    newList.add(sum.get(i));
                    break;
                }
            }
        }
        answer=sum.size()-newList.size();
        System.out.println("Hello Java");
        return answer;
    }
}