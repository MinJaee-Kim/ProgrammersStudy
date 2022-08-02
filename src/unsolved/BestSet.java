package unsolved;

import java.util.ArrayList;

class Solution99 {
    int max = 0;
    public int[] solution(int n, int s) {
        int[] answer = {};

        dfs(new ArrayList<Integer>(), n, 0, 0, s);
        System.out.println(max);

        return answer;
    }

    private void dfs(ArrayList<Integer> numList, int n, int m, int add, int result) {

    }

    public static void main(String[] args) {
        Solution99 solution99 = new Solution99();

        System.out.println(solution99.solution(2, 9));
    }
}