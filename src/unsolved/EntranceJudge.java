package unsolved;

import java.util.Arrays;

class Solution120 {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left = 0;
        long right = (long) n * times[times.length - 1];
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i];
            }
            if (sum < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
                answer = mid;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Solution120 solution120 = new Solution120();
        int[] times = {7, 10};

        System.out.println(solution120.solution(6, times));
    }
}