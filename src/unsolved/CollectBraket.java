package unsolved;

import java.util.Stack;

class Solution56 {
    public String solution(String p) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i=0; i<p.length(); i++){
            if (p.charAt(i)=='('){
                stack.push('(');
                while (!stack2.isEmpty()){
                    answer+=stack2.pop();
                }
            }
            if (p.charAt(i)==')'){

                stack2.push(')');
                while (!stack.isEmpty()){
                    answer+=stack.pop();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();

        System.out.println(solution56.solution("()))((()"));
    }
}