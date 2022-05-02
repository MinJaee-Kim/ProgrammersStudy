class Solution39 {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = dfs(numbers, target, 0, 0);

        return answer;
    }

    private int dfs(int[] numbers, int target, int depth, int sum) {
        int targetNum = 0;
        if (depth==numbers.length){
            if (target==sum)
                return 1;

            return 0;
        }

        targetNum += dfs(numbers, target, depth+1, sum+numbers[depth]);
        targetNum += dfs(numbers, target, depth+1, sum-numbers[depth]);

        return targetNum;
    }


    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        System.out.println(solution39.solution(numbers, target));
    }
}