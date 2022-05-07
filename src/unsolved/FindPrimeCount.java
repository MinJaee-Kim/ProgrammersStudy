package unsolved;

class Solution61 {
    int cnt = 1;
    public int solution(int n) {
        int answer = 0;

        prime(n);

        return cnt;
    }

    private void prime(int n) {
        if (n==1)
            return;

        for (int i=2; i<n; i++){
            if (n%i==0){
                break;
            } else if (i==n-1){
                cnt++;
            }
        }
        prime(n-1);

        return;
    }

    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();

        System.out.println(solution61.solution(10));
    }
}