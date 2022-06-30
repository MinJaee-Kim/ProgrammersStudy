package solved;

class Solution110 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i=0; i< seoul.length; i++){
            if (seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        Solution110 solution110 = new Solution110();

        System.out.println(solution110.solution(seoul));
    }
}