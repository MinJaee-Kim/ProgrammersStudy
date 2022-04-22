import java.util.LinkedList;
import java.util.Queue;

class Solution34 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<truck_weights.length; i++){
            queue.add(truck_weights[i]);
        }
        int truWeight = 0;
        int count=0;

        while (!queue.isEmpty()) {
            if (truWeight+queue.peek() <= weight) {
                truWeight += queue.peek();

                queue.poll();
                answer++;

                if (!queue.isEmpty()){
                    continue;
                }
            }
            truWeight=0;
            answer+=bridge_length;
            System.out.println(answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        int[] truck_weights = {7,4,5,6};

        System.out.println(solution34.solution(2, 10, truck_weights));
    }
}