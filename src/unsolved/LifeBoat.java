package unsolved;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution47 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int compare = 0;
        Stack<Integer> stack = new Stack();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int i=0; i<people.length; i++){
            queue.add(people[i]);
        }

        while (!queue.isEmpty() || !queue2.isEmpty()){
            if(stack.isEmpty()) {
                stack.push(queue.poll());
                continue;
            }
            compare = queue.peek();

            if (stack.peek()+compare<=limit){
                stack.pop();
                queue.poll();
                answer++;
            } else {
                queue2.add(queue.poll());
            }

            if (queue.isEmpty()){
                queue.addAll(queue2);
                queue2.clear();
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(solution47.solution(people, limit));
    }
}