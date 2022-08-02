package solved;

import java.util.Stack;

class Solution35 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack();
        int index = 1;
        int count = 0;

        stack.add(Character.getNumericValue(number.charAt(0)));

        while (count<k&&index<number.length()){
            if (stack.empty()){
                stack.add(Character.getNumericValue(number.charAt(index)));
                index++;
            } else if (stack.peek()<Character.getNumericValue(number.charAt(index))){
                stack.pop();
                count++;
            } else {
                stack.add(Character.getNumericValue(number.charAt(index)));
                index++;
            }
        }

        if (index>=number.length()){
            answer.append(number, 0, number.length()-k);
        } else {
            for (Integer i:stack){
                answer.append(i);
            }
        }

        answer.append(number.substring(index));


        return answer.toString();
    }

    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        String number = "654321";

        System.out.println(solution35.solution(number, 5));
    }
}