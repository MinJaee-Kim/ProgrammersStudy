package solved;

import java.util.Arrays;

class Solution89 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i=0; i<A.length; i++){
            answer += A[i]*B[B.length-1-i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution89 solution89 = new Solution89();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        System.out.println(solution89.solution(A, B));
    }
}