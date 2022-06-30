package solved;


import java.util.LinkedList;
import java.util.Queue;

class Solution74 {
    public int solution(int[][] maps) {
        int[] dX = {1, -1, 0, 0};
        int[] dY = {0, 0, -1, 1};
        int[][] visited = new int[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0, 0});
        visited[0][0] = 1;

        while (!queue.isEmpty()){
            int[] position = queue.poll();
            int x = position[1];
            int y = position[0];

            for (int i=0; i<4; i++){
                int cX = x+dX[i];
                int cY = y+dY[i];

                if(cY < 0 || cY > maps.length-1 || cX < 0 || cX > maps[0].length-1)
                    continue;

                if (visited[cY][cX]==0&&maps[cY][cX]==1){
                    visited[cY][cX] = visited[y][x]+1;
                    queue.add(new int[]{cY, cX});
                }
            }
        }

        if (visited[maps.length-1][maps[0].length-1]==0){
            return -1;
        }

        return visited[maps.length-1][maps[0].length-1];
    }



    public static void main(String[] args) {
        Solution74 solution74 = new Solution74();
        int[][] maps = {{1,1,1,1,1},{0,0,0,0,1},{0,0,0,0,1},{0,0,0,0,1},{0,0,0,0,1}};
        int[][] maps2 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};

        System.out.println(solution74.solution(maps2));
    }
}