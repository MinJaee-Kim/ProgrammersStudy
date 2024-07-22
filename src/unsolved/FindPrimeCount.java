package unsolved;

class Solution61 {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++){
            answer+=isPrime(i)?1:0;
        }

        return answer;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();

        System.out.println(solution61.solution(10));
    }
}