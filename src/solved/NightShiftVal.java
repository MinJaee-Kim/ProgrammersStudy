package solved;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution129 {
    public long solution(int n, int[] works) {
        long answer = 0;
        int num = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Collections.reverseOrder());

        for (Integer i:works) {
            priorityQueue.add(i);
        }

        for (int i=0; i<n; i++) {
            num = priorityQueue.poll()-1;
            priorityQueue.add(Math.max(num, 0));
        }

        while (!priorityQueue.isEmpty()){
            answer+=Math.pow(priorityQueue.poll(), 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution129 solution129 = new Solution129();
        int[] works = {1, 1};

        System.out.println(solution129.solution(3, works));
    }
}
