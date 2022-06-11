package solved;

class Solution103 {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<n; i++){
            if (n%i==1){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution103 solution103 = new Solution103();

        System.out.println(solution103.solution(10));
    }
}