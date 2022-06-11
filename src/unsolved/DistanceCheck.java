package unsolved;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

class Solution40 {
    int[] answer = {1, 1, 1, 1, 1};
    public int[] solution(String[][] places) {

        for (int i=0; i< places.length; i++){
            boolean[][] visited = new boolean[places.length][places.length];
            for (int j=0; j< places[i].length; j++){
                for (int k=0; k< places[i][j].length(); k++){
                    if (places[i][j].charAt(k)=='P'){
                        dfs(places, k, i, j, 0);
                    }
                }
            }
        }

        for (int i=0; i< answer.length; i++) {
            System.out.print(answer[i]);
        }

        return answer;
    }

    private void dfs(String[][] places, int now, int x, int y, int depth) {
        if (now>=0&&y>=0&&y<places.length) {
            if (now<places[x][y].length()) {
                if (depth!=0&&places[x][y].charAt(now) == 'P'){
                    answer[x] = 0;
                }
                if (depth==0) {
                    dfs(places, now+1, x, y, 1);
                    dfs(places, y, x, now+1, 1);
                    dfs(places, now-1, x, y, 1);
                    dfs(places, y, x, now-1, 1);
                } else if (depth>0 && places[x][y].charAt(now) == 'X') {

                } else if (depth>0 && places[x][y].charAt(now) == 'O') {

                }
            }
        }
    }

    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
        {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
        {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
        {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
        {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        System.out.println(solution40.solution(places));
    }
}