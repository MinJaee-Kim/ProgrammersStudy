package solved;

class Solution108 {
    public String solution(String s, int n) {
        String answer = "";

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122){
                if (s.charAt(i)+n>122)
                    answer += Character.toString((char) (s.charAt(i)+n-26));
                else if (s.charAt(i)+n>90&&s.charAt(i)>=65&&s.charAt(i)<=90)
                    answer += Character.toString((char) (s.charAt(i)+n-26));
                else
                    answer += Character.toString((char) (s.charAt(i)+n));
            } else {
                answer += s.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution108 solution108 = new Solution108();

        System.out.println(solution108.solution("Z", 10));
    }
}