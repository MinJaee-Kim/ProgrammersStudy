package unsolved;

import java.util.Arrays;

class Solution107 {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int i=0; i< sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        for (int i=0; i< sizes.length; i++) {
            min = Math.max(min, sizes[i][0]);
            max = Math.max(max, sizes[i][1]);
        }

        return max*min;
    }

    public static void main(String[] args) {
        Solution107 solution107 = new Solution107();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        System.out.println(solution107.solution(sizes2));
    }
}