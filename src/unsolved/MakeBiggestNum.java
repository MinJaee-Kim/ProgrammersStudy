package unsolved;

import java.util.Stack;

class Solution35 {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack = new Stack();

        for (int i=0; i<number.length(); i++){
            if (k<=0){
                break;
            }
            if (stack.isEmpty()) {
                stack.push(number.charAt(i));
                continue;
            }

            if (stack.peek()>number.charAt(i)){
                stack.pop();
                number=number.substring(0, i)+number.substring(i+1);
                i-=2;
                k--;
            } else if (stack.peek()==number.charAt(i)) {
//                i--;
                continue;
            } else {
                stack.pop();
                number=number.substring(i);
                i-=2;
                k--;
            }
        }



        return number;
    }

    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        String number = "4177252841";

        System.out.println(solution35.solution(number, 4));
    }
}