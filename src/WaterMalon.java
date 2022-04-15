class Solution30 {
    public String solution(int n) {
        String answer = "";

        for (int i=0; i<n; i++){
            if (i%2==1){
                answer = answer + "박";
            } else {
                answer = answer + "수";
            } 
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();

        System.out.println(solution30.solution(4));
    }
}