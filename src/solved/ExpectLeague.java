package solved;

class Solution57 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (!(a==b)){
            a=(a+1)/2;
            b=(b+1)/2;

            answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution57 solution57 = new Solution57();

        System.out.println(solution57.solution(8, 4, 7));
    }
}