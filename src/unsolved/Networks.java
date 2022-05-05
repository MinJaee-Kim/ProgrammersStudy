package unsolved;

class Solution38 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[][] visited = new int[n][n];


        for (int i=0; i<computers.length; i++){
            for (int j=0; j<computers[i].length; j++){
                answer += dfs(computers, visited, j, i);
            }
        }

        return answer;
    }

    private int dfs(int[][] computers, int[][] visited, int j, int i){
        if (visited[i][j]==2){
            return 0;
        }
        if (computers[i][j]==0){
            return 0;
        }
        visited[i][j] = 2;

        for (; j< computers.length; j++){
            if (computers[i][j]==1){
                dfs(computers, visited, j, i);
                dfs(computers, visited, i, j);
            }
        }

        return 1;
    }


    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        int n = 4;
        int[][] computers = {{1, 1, 0, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}, {1, 0, 1, 1}};

        System.out.println(solution38.solution(n, computers));
    }
}