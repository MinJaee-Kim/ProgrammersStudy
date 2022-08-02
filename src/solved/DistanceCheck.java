package solved;

class Solution40 {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        int value = 0;
        boolean isNotSafe = false;

        for (int i=0; i< places.length; i++){
            for (int j=0; j< places[0].length; j++) {
                for (int k=0; k< places[0][0].length(); k++) {
                    value = dfs(places, i, 0, j, k);
                    if (places[i][j].charAt(k)=='O'){
                        if (value>=2){
                            isNotSafe = true;
                            break;
                        }
                    } else if (places[i][j].charAt(k)=='P') {
                        if (value>=1){
                            isNotSafe = true;
                            break;
                        }
                    }
                }
                if (isNotSafe) {
                    break;
                }
            }
            if (isNotSafe) {
                isNotSafe = false;
                answer[i] = 0;
            } else {
                answer[i] = 1;
            }
        }

        return answer;
    }

    private int dfs(String[][] places, int n, int depth, int y, int x) {
        int value = 0;
        if (depth==1){
            return 1;
        }

        if (x+1<places[0][0].length()) {
            if (places[n][y].charAt(x + 1) == 'P') {
                value+=dfs(places, n, depth + 1, y, x+1);
            }
        }

        if (x-1>0) {
            if (places[n][y].charAt(x - 1) == 'P') {
                value+=dfs(places, n, depth + 1, y, x-1);
            }
        }

        if (y+1<places[0].length) {
            if (places[n][y + 1].charAt(x) == 'P') {
                value+=dfs(places, n, depth + 1, y+1, x);
            }
        }

        if (y-1>0) {
            if (places[n][y - 1].charAt(x) == 'P') {
                value+=dfs(places, n, depth + 1, y-1, x);
            }
        }

        return value;
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