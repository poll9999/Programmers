package Level1;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums1={3,1,2,3};
        int[] nums2={3,3,3,2,2,4};
        int[] nums3={3,3,3,2,2,2};

        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
        System.out.println(solution(nums3));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int data : nums) {
            set.add(data);
        }

        if (set.size() > max) {
            answer=max;
        }
        else {
            answer=set.size();
        }

        return answer;
    }
}
