package unsolved;

class Solution123 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];

        for(int i=0; i<n; i++){
            dp[i][0] = 1;
        }

        for(int i=0; i<m; i++){
            dp[0][i] = 1;
        }

        for(int i=0; i<puddles.length; i++){
            dp[puddles[i][1]-1][puddles[i][0]-1] = -1;

            if(puddles[i][1]-1==0){
                for(int j=puddles[i][0]-1; j<m; j++){
                    dp[0][j] = -1;
                }
            }
            if(puddles[i][0]-1==0){
                for(int j=puddles[i][1]-1; j<n; j++){
                    dp[j][0] = -1;
                }
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(dp[i][j]==-1) {
                    continue;
                }else if(dp[i-1][j]==-1){
                    dp[i][j] = dp[i][j-1];
                }else if(dp[i][j-1]==-1){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1])%1000000007;
                }
            }
        }

        return dp[n-1][m-1]==-1?0:dp[n-1][m-1];
    }

    public static void main(String[] args) {
        Solution123 solution123 = new Solution123();
        int[][] puddles = {{1, 2}};

        System.out.println(solution123.solution(4, 3, puddles));
    }
}