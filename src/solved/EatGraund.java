package solved;

class Solution46 {
    int solution(int[][] land) {
        for (int i=0; i<land.length-1; i++){
            land[i+1][0] = land[i+1][0] + Math.max(land[i][1], Math.max(land[i][2], land[i][3]));
            land[i+1][1] = land[i+1][1] + Math.max(land[i][0], Math.max(land[i][2], land[i][3]));
            land[i+1][2] = land[i+1][2] + Math.max(land[i][1], Math.max(land[i][0], land[i][3]));
            land[i+1][3] = land[i+1][3] + Math.max(land[i][1], Math.max(land[i][2], land[i][0]));
        }

        return Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), Math.max(land[land.length-1][2], land[land.length-1][3]));
    }

    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        System.out.println(solution46.solution(land));
    }
}