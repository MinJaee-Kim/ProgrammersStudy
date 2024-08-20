package unsolved;

public class OrganizeWallPaper {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int[] minDirection = {51, 51};
        int[] maxDirection = {0, 0};

        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(String.valueOf(wallpaper[i].charAt(j)).equals("#")) {
                    if(minDirection[0]>i) minDirection[0] = i;
                    if(minDirection[1]>j) minDirection[1] = j;
                    if(maxDirection[0]<j+1) maxDirection[0] = j+1;
                    if(maxDirection[1]<i+1) maxDirection[1] = i+1;
                }
            }
        }
        answer[0] = minDirection[0];
        answer[1] = minDirection[1];
        answer[2] = maxDirection[1];
        answer[3] = maxDirection[0];

        return answer;
    }
    public static void main(String[] args) {
        OrganizeWallPaper w = new OrganizeWallPaper();
        String[] wallpaper = 
        {".##...##.",
        "#..#.#..#",
        "#...#...#",
        ".#.....#.",
        "..#...#..",
        "...#.#...",
        "....#...."};

        System.out.println(w.solution(wallpaper));
    }
}
