package solved;

import java.util.Stack;

class Solution79 {
    public int solution(String s) {
        int answer = 0;

        for (int i=0; i<s.length(); i++){
            if (isRight(s)){
                answer++;
            }

            s = s.substring(1)+s.charAt(0);
        }

        return answer;
    }

    private boolean isRight(String s) {
        Stack<Character> stack = new Stack();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{'){
                stack.add(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;

                if (s.charAt(i)==']'){
                    if (stack.peek()=='['){
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (s.charAt(i)==')') {
                    if (stack.peek()=='('){
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (s.charAt(i)=='}') {
                    if (stack.peek() == '{'){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        if (!stack.isEmpty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        Solution79 solution79 = new Solution79();
        String s = "{{{{{{{";

        System.out.println(solution79.solution(s));
    }
}