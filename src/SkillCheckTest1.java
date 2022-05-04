import java.util.PriorityQueue;

class Solution54 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=0; i<d.length; i++){
            priorityQueue.add(d[i]);
        }

        while (!priorityQueue.isEmpty()){
            answer+=priorityQueue.poll();
            if (answer>budget){
                break;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        Solution54 solution54 = new Solution54();

        System.out.println(solution54.solution(d, budget));
    }
}