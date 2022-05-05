package solved;

import java.util.Stack;

class Solution4 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stackList = new Stack<>();

        for (int i=0; i< moves.length; i++){
            for (int j=0; j< board[moves[i]-1].length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (!stackList.empty()){
                        if (stackList.peek()==board[j][moves[i] - 1]){
                            stackList.pop();
                            board[j][moves[i] - 1] = 0;
                            answer+=2;
                            break;
                        }
                    }
                    stackList.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }


        return answer;
    }
}