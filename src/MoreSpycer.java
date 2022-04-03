import java.util.PriorityQueue;

class Solution22 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int isK = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=0; i<scoville.length; i++){
            priorityQueue.add(scoville[i]);
        }

        while (!priorityQueue.isEmpty()){
            Integer first = priorityQueue.poll();
            Integer second = priorityQueue.peek();

            if (first>=K){
                isK = 1;
                break;
            } else {
                if (second == null) break;
                priorityQueue.add(first + (second*2));
                priorityQueue.poll();
                answer++;
            }
        }
        if (isK == 1){
            return answer;
        }

        if (isK == 0){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        int[] scoville = {1, 2};

        System.out.println(solution22.solution(scoville, 7));
    }
}
