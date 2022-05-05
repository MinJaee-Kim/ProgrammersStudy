package solved;

class Solution45 {
    public String solution(String s) {
        String answer = "";
        int index = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)==' '){
                index=0;
            } else {
                index++;
            }
            if (index==1){
                answer += String.valueOf(s.charAt(i)).toUpperCase();
            } else {
                answer += String.valueOf(s.charAt(i)).toLowerCase();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();

        System.out.println(solution45.solution("3people  unFollowed me"));
    }
}