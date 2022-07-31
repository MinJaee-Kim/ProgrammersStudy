package unsolved;

class Solution122 {
    public int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Solution122 solution122 = new Solution122();
        int[][] game_board = {{1,1,0,0,1,0},{0,0,1,0,1,0},{0,1,1,0,0,1},{1,1,0,1,1,1},{1,0,0,0,1,0},{0,1,1,1,0,0}};
        int[][] table = {{1,0,0,1,1,0},{1,0,1,0,1,0},{0,1,1,0,1,1},{0,0,1,0,0,0},{1,1,0,1,1,0},{0,1,0,0,0,0}};

        System.out.println(solution122.solution(game_board, table));
    }
}