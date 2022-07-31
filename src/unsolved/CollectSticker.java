package unsolved;

class Solution119 {
    public int solution(int sticker[]) {
        int[] dp = new int[sticker.length-1];
        int[] dp2 = new int[sticker.length-1];

        dp[0] = sticker[0];
        dp2[0] = sticker[1];

        for (int i=2; i< sticker.length; i+=2){
            if (i+2 > dp.length){
                break;
            }
            dp[i] = Math.max(dp[i-2]+sticker[i], dp[i-2]+sticker[i+1]);
            dp[i+1] = Math.max(dp[i-2]+sticker[i], dp[i-2]+sticker[i+1]);
            if (sticker[i+1]>sticker[i]){
                i++;
            }
        }

        for (int i=2; i< sticker.length; i+=2){
            if (i+2 > dp.length){
                break;
            }
            dp2[i] = Math.max(dp2[i-2]+sticker[i], dp2[i-2]+sticker[i+1]);
            dp2[i+1] = Math.max(dp2[i-2]+sticker[i], dp2[i-2]+sticker[i+1]);
            if (sticker[i+1]<sticker[i]){
                i++;
            }
        }

        if (dp2[dp2.length-1]==0){
            dp2[dp2.length-1] = dp2[dp2.length-2]+sticker[sticker.length-1];
        }

        return Math.max(dp[dp.length-1], dp2[dp2.length-1]);
    }

    public static void main(String[] args) {
        Solution119 solution119 = new Solution119();
        int[] sticker = {1, 3, 2, 5, 4};

        System.out.println(solution119.solution(sticker));
    }
}