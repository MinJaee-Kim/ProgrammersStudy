package unsolved;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class FriendsGame {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        int count = 1;
        Set<String> emptySet = new HashSet();
        String[][] convertBoard = new String[board.length][board.length];
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < board.length; i++) {
            convertBoard[i] = board[i].split("");
        }

        while (count!=0){
            for(int i = 1; i<m; i++){
                for(int j = 1; j<n; j++){
                    boolean isFour = !convertBoard[i][j].equals("-")&&convertBoard[i][j].equals(convertBoard[i][j-1])&&convertBoard[i][j].equals(convertBoard[i-1][j])&&convertBoard[i][j].equals(convertBoard[i-1][j-1]);

                    if(isFour) {
                        emptySet.add(i+","+j);
                        emptySet.add((i-1)+","+j);
                        emptySet.add(i+","+(j-1));
                        emptySet.add((i-1)+","+(j-1));
                    }
                }
            }
            count = emptySet.size();
            answer+=count;

            for (String s : emptySet) {
                String[] parts = s.split(",");
                int[] location = {Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
                convertBoard[location[0]][location[1]] = "-";
            }
            emptySet.clear();

            for (int i = 0; i < n; i++) {
                boolean isConvert = false;
                stack.clear();
                for (int j = 0; j < m; j++) {
                    if(!convertBoard[j][i].equals("-")){
                        stack.push(convertBoard[j][i]);
                    } else {
                        isConvert = true;
                    }
                }

                for(int j = m-1; j >= 0; j--) {
                    if(!isConvert) break;

                    String temp = "-";
                    if(!stack.isEmpty()) temp = stack.pop();
                    convertBoard[j][i] = temp;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FriendsGame game = new FriendsGame();
        String[] board = {"CCBDE",
                          "AAADE",
                          "AAABF",
                          "CCBBF"};

        System.out.println(game.solution(4, 5, board));

    }
}
