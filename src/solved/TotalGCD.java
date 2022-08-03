package solved;

class Solution130 {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++){
            if (n%i==0)
                answer+=i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution130 solution130 = new Solution130();

        System.out.println(solution130.solution(12));
    }
}