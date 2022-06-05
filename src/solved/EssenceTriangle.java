package solved;

class Solution93 {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];

        for (int i=0; i< triangle[triangle.length-1].length; i++){
            dp[triangle.length-1][i] = triangle[triangle.length-1][i];
        }

        for (int i=triangle.length-1; i>0; i--){
            for (int j=triangle[i-1].length-1; j>=0; j--){
                dp[i-1][j] = triangle[i-1][j] + Math.max(dp[i][j], dp[i][j+1]);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        Solution93 solution93 = new Solution93();
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        System.out.println(solution93.solution(triangle));
    }
}