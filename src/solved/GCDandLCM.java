package solved;

class Solution95 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = (m>n) ? getGCD(m, n) : getGCD(n, m);

        answer[1] = n*m/answer[0];

        return answer;
    }

    private int getGCD(int m, int n) {
        if (m%n==0){
            return n;
        } else {
            return getGCD(n, m%n);
        }
    }

    public static void main(String[] args) {
        Solution95 solution95 = new Solution95();

        System.out.println(solution95.solution(2, 5));
    }
}