package solved;

class Solution53 {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        boolean[][] visited = new boolean[m][n];
        boolean[][] visited2 = new boolean[m][n];
        int[][] picCopy = picture;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                maxSizeOfOneArea = Math.max(maxSizeOfOneArea, dfs(picCopy, visited, i, j));
            }

             for (int j=0; j<n; j++){
                numberOfArea += dfs2(picCopy, visited2, i, j);
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }

    private int dfs(int[][] picCopy, boolean[][] visited, int i, int j) {
        int value = 1;

        if (visited[i][j]) {
            return 0;
        }
        if (picCopy[i][j]==0){
            return 0;
        }

        visited[i][j] = true;


        if (!(j+1>=picCopy[i].length)) {
            if (picCopy[i][j] == picCopy[i][j + 1]) {
                value += dfs(picCopy, visited, i, j + 1);
            }
        }

        if (!(j-1<0)) {
            if (picCopy[i][j] == picCopy[i][j - 1]){
                value += dfs(picCopy, visited, i, j - 1);
            }
        }

        if (!(i+1>=picCopy.length)) {
            if (picCopy[i][j] == picCopy[i + 1][j]) {
                value += dfs(picCopy, visited, i + 1, j);
            }
        }

        if (!(i-1<0)) {
            if (picCopy[i][j] == picCopy[i-1][j]){
                value += dfs(picCopy, visited, i-1, j);
            }
        }

        return value;
    }

    private int dfs2(int[][] picCopy, boolean[][] visited, int i, int j) {
        if (visited[i][j]) {
            return 0;
        }
        if (picCopy[i][j]==0){
            return 0;
        }

        visited[i][j] = true;

        if (!(j+1>=picCopy[i].length)) {
            if (picCopy[i][j] == picCopy[i][j + 1]) {
                dfs2(picCopy, visited, i, j + 1);
            }
        }

        if (!(j-1<0)) {
            if (picCopy[i][j] == picCopy[i][j - 1]){
                dfs2(picCopy, visited, i, j - 1);
            }
        }

        if (!(i+1>=picCopy.length)) {
            if (picCopy[i][j] == picCopy[i + 1][j]) {
                dfs2(picCopy, visited, i + 1, j);
            }
        }

        if (!(i-1<0)) {
            if (picCopy[i][j] == picCopy[i-1][j]){
                dfs2(picCopy, visited, i-1, j);
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        int[][] picture = {{ 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 }};

        System.out.println(solution53.solution(6, 4, picture));
    }
}