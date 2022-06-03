package solved;

import java.util.PriorityQueue;

class Solution92 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();

        for (String s : operations){
            if (s.charAt(0)=='I'){
                if (s.charAt(2)!='-') {
                    priorityQueue.add(Integer.valueOf(s.substring(2)));
                } else {
                    priorityQueue.add(-Integer.parseInt(s.substring(3)));
                }
            } else {
                if (s.charAt(2)!='-') {
                    PriorityQueue<Integer> priorityQueue2 = new PriorityQueue();
                    priorityQueue2.addAll(priorityQueue);
                    int value = 0;
                    while (!priorityQueue2.isEmpty()){
                        value = priorityQueue2.poll();
                    }
                    priorityQueue.remove(value);
                } else {
                    priorityQueue.poll();
                }
            }
        }

        int[] answer = new int[2];
        int value = -99999;

        while (!priorityQueue.isEmpty()){
            if (value==-99999){
                value = priorityQueue.poll();
                answer[1] = value;
                continue;
            }
            value = priorityQueue.poll();

            if (priorityQueue.isEmpty()){
                answer[0] = value;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution92 solution92 = new Solution92();
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

        System.out.println(solution92.solution(operations));
    }
}