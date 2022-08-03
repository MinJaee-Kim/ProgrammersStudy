package unsolved;

class Solution98 {
    public int solution(String s) {
        int answer = 0;
        StringBuilder reverse = new StringBuilder();
        int index = 0;

        //i 자릿수
        for (int i=1; i<(s.length()+1)/2; i++) {
            //j 위치
            for (int j=0; j<s.length()-i; j++) {
                for (int k=j+i; k>=i; k--){
                    reverse.append(s.charAt(k));
                }

                String d = s.substring(j, j+i);

                reverse.delete(0, reverse.length());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution98 solution98 = new Solution98();

        System.out.println(solution98.solution("abcdcba"));
    }
}