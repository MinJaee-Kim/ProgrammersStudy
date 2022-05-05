package solved;

import java.util.Stack;

class Solution51 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='('){
                stack.add('(');
                continue;
            }
            if (s.charAt(i)==')'){
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    answer = false;
                    break;
                }
            }
        }

        if (!stack.empty()){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution51 solution51 = new Solution51();

        System.out.println(solution51.solution("()()"));
    }
}