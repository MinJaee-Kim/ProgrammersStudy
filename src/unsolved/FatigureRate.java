package unsolved;

class Solution76 {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;

        for (int i=0; i<dungeons.length; i++){
            boolean[] visited = new boolean[dungeons.length];
            answer = Math.max(answer, dfs(k, dungeons, visited, 0, k));
        }

        return answer;
    }

    private int dfs(int k, int[][] dungeons, boolean[] visited, int depth, int fatigure) {
        int value = 1;
        if (depth==dungeons.length){
            return 0;
        }
        if (visited[depth]){
            return 0;
        }
        visited[depth] = true;


        if (dungeons[depth][0]<=k){
            value+=dfs(k, dungeons, visited, depth+1, fatigure-dungeons[depth][1]);
        } else {
            dfs(k, dungeons, visited, depth+1, fatigure);
        }


        return value;
    }

    public static void main(String[] args) {
        Solution76 solution76 = new Solution76();
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        System.out.println(solution76.solution(k, dungeons));
    }
}