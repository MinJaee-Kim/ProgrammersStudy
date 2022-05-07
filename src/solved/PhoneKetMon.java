package solved;

import java.util.HashSet;

class Solution64 {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet();
        for (int i=0; i<nums.length; i++) {
            hashSet.add(nums[i]);
        }

        answer = Math.min(hashSet.size(), nums.length/2);

        return answer;
    }

    public static void main(String[] args) {
        Solution64 solution64 = new Solution64();
        int[] nums = {3,1,2,3};

        System.out.println(solution64.solution(nums));
    }
}