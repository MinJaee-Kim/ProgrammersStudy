import javax.swing.*;

class Solution40 {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        boolean[][] visited = new boolean[places.length][places.length];

        for (int i=0; i< places[0][0].length(); i++) {
            for (int j = 0; j < places[0][0].length(); j++) {
                if (places[0][0].charAt(i) == 'P') {
                    answer[0] = dfs(places, visited, i, j, 0, 0);
                }
            }
        }

        return answer;
    }

    private int dfs(String[][] places, boolean[][] visited, int i, int depthX, int depthY, int repeat) {
        if (depthX < 0 || depthX > 4 || depthX > i+2 || depthX < i-3){
            return 1;
        } else if (depthY < 0 || depthY > i+2) {
            return 1;
        }

        if (visited[depthY][depthX]){
            if (places[i][depthY].charAt(depthX) == 'P') {
                return 0;
            }
            return 1;
        }

        if (places[i][depthY].charAt(depthX) == 'X') {
            return 1;
        }
        visited[depthY][depthX] = true;


        dfs(places, visited, i, depthX + 1, depthY, 1);


        if (repeat==0) {
            dfs(places, visited, i, depthX - 1, depthY, repeat);
        }
//
//
//        dfs(places, visited, i, depthX, depthY+1, repeat);
//
//
//        dfs(places, visited, i, depthX, depthY-1, repeat);




        return 1;
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