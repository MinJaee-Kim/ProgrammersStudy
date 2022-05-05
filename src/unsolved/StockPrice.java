package unsolved;

import java.util.LinkedList;
import java.util.Queue;

class Solution37 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0;
        int index = 0;
        Queue<Integer> queue = new LinkedList();
        Queue<Integer> queue2 = new LinkedList();

        for (int i=0; i< prices.length; i++) {
            queue.add(prices[i]);
        }

        while (prices.length>index) {
            int num = queue.poll();
            while (!queue.isEmpty()) {
                count++;
                if (num <= queue.peek()) {
                    queue2.add(queue.poll());
                } else {
                    queue2.addAll(queue);
                    queue.clear();
                    break;
                }
            }
            if (!queue2.isEmpty()) {
                queue.addAll(queue2);
                queue2.clear();
            }

            answer[index] = count;
            index++;
            count = 0;

            if (queue.isEmpty())
                break;
        }

        for (int i=0; i< answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        int[] prices = {1, 2, 3, 2, 3, 1};

        System.out.println(solution37.solution(prices));
    }
}