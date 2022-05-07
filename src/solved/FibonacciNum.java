package solved;

class Solution59 {
    public int solution(int n) {
        return Fibonacci(n);
    }

    private int Fibonacci(int n) {
        int[] fibo = new int[n+1];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i=2; i<=n; i++){
            fibo[i] = fibo[i-1]%1234567+fibo[i-2]%1234567;
        }

        return fibo[n]%1234567;
    }

    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();

        System.out.println(solution59.solution(3));
    }
}