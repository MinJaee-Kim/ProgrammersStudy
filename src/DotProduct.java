class Solution27 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(solution27.solution(a, b));
    }
}