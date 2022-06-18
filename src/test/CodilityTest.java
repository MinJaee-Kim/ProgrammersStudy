package test;

import java.util.TreeSet;

class Solution {
    public int solution(int[] A) {
        int index = 1;
        int result = 1;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0; i<A.length; i++){
            treeSet.add(A[i]);
        }

        for (Integer set : treeSet){
            if (set==index){
                index++;
            } else {
                result = --set;
                index = set+2;
            }
        }

        if (result==1){
            result = index;
        } else if (result<0) {
            result = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, 2, 3};
        int[] C = {-1, -3};

        System.out.println(solution.solution(A));
        System.out.println(solution.solution(B));
        System.out.println(solution.solution(C));
    }
}
