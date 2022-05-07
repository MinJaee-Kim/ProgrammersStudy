package solved;

class Solution63 {
    public boolean solution(String s) {
        boolean answer = true;

        if (!(s.length()==4) && !(s.length()==6)) {
            return false;
        }

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) < 48 || s.charAt(i) > 57){
                return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution63 solution63 = new Solution63();

        System.out.println(solution63.solution("1234567"));
    }
}