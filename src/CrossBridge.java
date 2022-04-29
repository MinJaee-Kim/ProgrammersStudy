import java.util.LinkedList;
import java.util.Queue;
//덜 품
class Solution34 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<truck_weights.length; i++){
            queue.add(truck_weights[i]);
        }
        int addweight = 0;
        while (!queue.isEmpty()){
            int comp = queue.poll();
            if (comp + addweight <= weight) {

            } else {

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        int[] truck_weights = {100};

        System.out.println(solution34.solution(100, 100, truck_weights));
    }
}