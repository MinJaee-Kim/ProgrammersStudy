package solved;

class Solution111 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i=0; i<answer.length; i++){
            answer[i] = (long) (i + 1) *x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution111 solution111 = new Solution111();

        System.out.println(solution111.solution(2, 5));
    }
}