package unsolved;

class Solution76 {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, 0, 0, k, 0);

        return answer;
    }

    private void dfs(int[][] dungeons, boolean[] visited, int n, int depth, int fatigure, int value) {
        if (depth==dungeons.length){
            answer = Math.max(answer, value);
            return;
        }

        for (int i=0; i<dungeons.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (fatigure>=dungeons[i][0]) {
                    dfs(dungeons, visited, i, depth + 1, fatigure - dungeons[i][1], value+1);
                } else {
                    dfs(dungeons, visited, i, depth + 1, fatigure, value);
                }
                visited[i] = false;
            }
        }

        return;
    }

    public static void main(String[] args) {
        Solution76 solution76 = new Solution76();
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        System.out.println(solution76.solution(k, dungeons));
    }
}