class Solution25 {
    public int[] solution(int n) {
        int[] answer = new int[numLang(n)];
        int[][] answer2 = new int[n][n];
        int count=0;

        putNum(n, 1, answer2, true, true, 0, 0, 0);

        for (int i=0; i<answer2.length; i++) {
            for (int j=0; j<answer2[i].length; j++) {
                if (answer2[i][j]!=0){
                    answer[count] = answer2[i][j];
                    count++;
                }
            }
        }

        return answer;
    }

    public int numLang(int num) {
        if (num==1){
            return 1;
        } else {
            return num+numLang(num-1);
        }
    }

    public int putNum (int num, int number, int answer2[][], boolean x, boolean y, int repeat, int locationX, int locationY) {
        for (int i=repeat; i<num; i++){
            if (x){
                answer2[i-locationX][locationX] = number;
            } else if (y) {
                answer2[num-locationX][i-locationY] = number;
            } else if (!x && !y) {
                answer2[num-i+locationY-2][num-i+locationX-1] = number;
            }
            number++;
        }

        if (x){
            locationX++;
        } else if (y) {
            locationY+=2;
        }


        if (num == repeat){
            return 0;
        } else if (x) {
            return putNum(num, number, answer2, false, true, repeat+1, locationX, locationY);
        } else if (y) {
            return putNum(num, number, answer2, false, false, repeat+1, locationX, locationY);
        } else if (!y) {
            return putNum(num, number, answer2, true, true, repeat+1, locationX, locationY);
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();

        System.out.println(solution25.solution(5));
    }
}