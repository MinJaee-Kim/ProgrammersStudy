package unsolved;

import java.util.LinkedList;
import java.util.Queue;

class Solution100 {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int node;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[edge.length];

        queue.offer(1);

        while (!queue.isEmpty()){
            node = queue.poll();
            int count = 0;
            for (int i=0; i<edge.length; i++){
                if (!visited[i]) {
                    count++;
                    if (edge[i][0] == node) {
                        visited[i] = true;
                        if (queue.contains(edge[i][1])) {
                            continue;
                        }
                        queue.add(edge[i][1]);
                    } else if (edge[i][1] == node) {
                        visited[i] = true;
                        if (queue.contains(edge[i][0])) {
                            continue;
                        }
                        queue.add(edge[i][0]);
                    }
                }
            }

            if (count==0) {
                answer = queue.size()+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution100 solution100 = new Solution100();
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        System.out.println(solution100.solution(6, edge));
    }
}