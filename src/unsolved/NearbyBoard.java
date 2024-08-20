package unsolved;

class NearbyBoard {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        NearbyBoard n = new NearbyBoard();
        String[][] board = {{"blue", "red", "orange", "red"},
         {"red", "red", "blue", "orange"},
         {"blue", "orange", "red", "red"},
         {"orange", "orange", "red", "blue"}};

        System.out.println(n.solution(board, 0, 1));
    }
}