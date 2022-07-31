package unsolved;

class Solution121 {
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;

        int[][] rotateKey = new int[(key.length*3)-2][(key.length*3)-2];
        int[][] moveKey = new int[(key.length*3)-2][(key.length*3)-2];
        int count;

        //회전
        for (int i=0; i< key.length; i++){
            for (int j=0; j< key[i].length; j++){
                rotateKey[i][key.length-1-j] = key[j][i];
            }
        }

        for (int i=0; i< rotateKey.length; i++){
            moveKey[i] = rotateKey[i];
        }
        while (true){
            count = 0;
            for (int i=0; i< lock.length; i++) {
                for (int j=0; j< lock[i].length; j++) {
                    if (lock[i][j]!=moveKey[i+key.length][j+key.length]){
                        count++;
                    }
                }
            }


            if (count == lock.length*lock.length){
                break;
            } else {
                //이동 아래
                for (int i=rotateKey.length-1; i>0; i--){
                    moveKey[i] = moveKey[i-1];
                }
                moveKey[0] = moveKey[rotateKey.length-1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        Solution121 solution121 = new Solution121();

        System.out.println(solution121.solution(key, lock));
    }
}