package solved;

class Solution37 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i=0; i< prices.length; i++){
            for (int j=i+1; j< prices.length; j++){
                answer[i]++;
                if (prices[j]<prices[i]){
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        int[] prices = {1, 2, 3, 2, 3};

        System.out.println(solution37.solution(prices));
    }
}