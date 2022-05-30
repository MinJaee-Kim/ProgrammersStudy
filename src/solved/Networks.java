package solved;

import java.util.LinkedList;
import java.util.Queue;

class Solution38 {
    boolean[] visit;
    public int solution(int n, int[][] computers) {
        int answer = 0;
//        boolean[][] visited = new boolean[n][n];
//        for (int i=0; i<computers.length; i++) {
//            for (int j=0; j<computers[i].length; j++) {
//                answer+=dfs(computers, visited, i, j);
//            }
//        }

        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visit[i]){
                continue;
            }

            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            visit[i] = true;
            answer++;

            while (!q.isEmpty()) {
                int computer = q.poll();

                for (int j = 0; j < n; j++) {
                    if (j == computer || visit[j]) {
                        continue;
                    }
                    if (computers[computer][j] == 1) {
                        q.offer(j);
                        visit[j] = true;
                    }
                }
            }

        }

        return answer;
    }

    private int dfs(int[][] computers, boolean[][] visited, int i, int j){
        if (visited[i][j])
            return 0;
        if (computers[i][j]==0)
            return 0;

        visited[i][j] = true;

        for (int k=0; k<computers.length; k++) {
            if (computers[i][k] == 1) {
                dfs(computers, visited, i, k);
            }
        }
        if (computers[j][i]==1){
            dfs(computers, visited, j, i);
        }

        return 1;
    }


    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(solution38.solution(n, computers));
    }
}