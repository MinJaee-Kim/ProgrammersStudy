package solved;

class Solution81 {
    public long solution(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        if (n>1) {
            dp[1] = 2;
            for (int i = 2; i < n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2])%1234567;
            }
        }

//        answer = dfs(n)%1234567;

        return dp[n-1];
    }

//    private int dfs(int n) {
//        int value = 0;
//        if (n==0) {
//            return 1;
//        } else if (n<0){
//            return 0;
//        }
//
//        value+=dfs(n-1);
//        value+=dfs(n-2);
//
//        return value;
//    }

    public static void main(String[] args) {
        Solution81 solution81 = new Solution81();

        System.out.println(solution81.solution(4));
    }
}