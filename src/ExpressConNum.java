class Solution42 {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        for (int i = 1; i< n+1/2; i++){
            for (int j = i; j< n+1/2; j++){
                sum += j;
                if (sum==n){
                    answer++;
                    break;
                } else if (sum>n){
                    break;
                }
            }
            sum = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();

        System.out.println(solution42.solution(10));
    }
}