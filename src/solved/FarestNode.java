package solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution100 {
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i=0; i<edge.length; i++){
            graph.add(new ArrayList<>());
        }
        //양방향
        for (int i = 0; i < edge.length; i++) {
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }

        boolean[] visited = new boolean[edge.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[1] = true;
        queue.offer(1);
        int[] distance = new int[edge.length];

        while (!queue.isEmpty()){
            int now = queue.poll();
            ArrayList<Integer> node = graph.get(now);
            for (int i=0; i<node.size(); i++){
                if (!visited[node.get(i)]){
                    queue.add(node.get(i));
                    visited[node.get(i)] = true;
                    distance[node.get(i)] = distance[now] + 1;
                }
            }
        }

        Arrays.sort(distance);
        int answer = 0;

        for (int i=0; i< distance.length; i++){
            if (distance[i]==distance[distance.length-1]){
                answer++;
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