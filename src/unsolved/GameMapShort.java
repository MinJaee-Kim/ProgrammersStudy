package unsolved;

class Solution74 {
    int min = 99999;
    public int solution(int[][] maps) {
        int answer = 0;
        boolean[][] visited = new boolean[maps.length][maps[0].length];

        dfs(maps, visited, 0, 0, 1);
        if (!visited[maps.length-1][maps[maps.length-1].length-1])
            min = -1;

        return min;
    }

    private int dfs(int[][] maps, boolean[][] visited, int i, int j, int value) {
        if (visited[i][j]){
            return 0;
        }
        visited[i][j] = true;


        if (j+1<maps[i].length) {
            if (maps[i][j + 1] == 1) {
                dfs(maps, visited, i, j + 1, value+1);
            }
        }
        if (i+1<maps.length) {
            if (maps[i + 1][j] == 1) {
                dfs(maps, visited, i + 1, j, value+1);
            }
        }
        if (i-1>=0) {
            if (maps[i - 1][j] == 1) {
                dfs(maps, visited, i - 1, j, value+1);
            }
        }
        if (j-1>=0) {
            if (maps[i][j - 1] == 1) {
                dfs(maps, visited, i, j - 1, value+1);
            }
        }
        if (i==maps.length-1 && j==maps[maps.length-1].length-1){
            min = Math.min(min, value);
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        Solution74 solution74 = new Solution74();
        int[][] maps = {{1,1,1,1,1},{0,0,0,0,1},{0,0,0,0,1},{0,0,0,0,1},{0,0,0,0,1}};

        System.out.println(solution74.solution(maps));
    }
}