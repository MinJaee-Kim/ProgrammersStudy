package unsolved;

class Solution75 {
    public int solution(int n) {
        int ans = 0;

        while (n>0){
            if (n%2==1){
                ans++;
                n-=1;
            } else {
                n/=2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();

        System.out.println(solution75.solution(5000));
    }
}