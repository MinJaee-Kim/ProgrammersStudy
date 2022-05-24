package unsolved;

class Solution75 {
    public int solution(int n) {
        int ans = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
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