package solved;

import java.util.Stack;

class Solution52 {
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){
            if (stack.empty()){
                stack.add(s.charAt(i));
                continue;
            }

            if (stack.peek()==s.charAt(i)){
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }

        if (stack.empty())
            answer = 1;

        return answer;
    }

    public static void main(String[] args) {
        Solution52 solution52 = new Solution52();

        System.out.println(solution52.solution("abbcdaadca"));
    }
}