package unsolved;

class Solution104 {
    public int solution(int [][]board) {
        int answer = 1234;
        int area = 0;
        boolean isSqur = true;

        int[][] dp = new int[board.length][board[0].length];
        for (int i=0; i<board.length; i++){
            area = i+1;
            for (int j=0; j<board[i].length; j++){

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution104 solution104 = new Solution104();
        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};

        System.out.println(solution104.solution(board));
    }
}