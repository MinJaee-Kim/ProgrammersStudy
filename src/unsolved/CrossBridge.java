package unsolved;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//덜 품
class Solution34 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int truck = 0;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack();

        for (int i=0; i<truck_weights.length+1; i++){
            if (queue.isEmpty()) {
                queue.add(truck_weights[i]);
                continue;
            } else {
                queue.add(truck_weights[i]);
                truck += queue.poll();
            }

            if (weight>=truck+queue.peek()){
                answer+= queue.size();
                answer+= bridge_length;
                queue.clear();
                truck=0;
            } else if (weight>truck){
                answer+=bridge_length;
                truck=0;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        System.out.println(solution34.solution(100, 100, truck_weights));
    }
}