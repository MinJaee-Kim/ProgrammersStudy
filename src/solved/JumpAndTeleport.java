package solved;

class Solution78 {
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
        Solution78 solution78 = new Solution78();

        System.out.println(solution78.solution(5000));
    }
}