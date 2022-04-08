class Solution25 {
    public int[] solution(int n) {
        int[] answer = new int[4];
        int[][] answer2 = new int[5][5];
        int num=0;

        putNum(n, 1, answer2, true, true, 0);

        for (int i=0; i<answer2.length; i++) {
            System.out.println(answer2[i][1]);
        }

        return answer;
    }

    public int putNum (int num, int number, int answer2[][], boolean x, boolean y, int repeat) {
        for (int i=repeat; i<num; i++){
            if (x){
                answer2[i][repeat] = number;
//                System.out.println(number);
            } else if (y) {
                answer2[num-1][i] = number;
//                System.out.println(number);
            } else if (!x && !y) {
//                answer2[repeat-i][repeat-i] = number;
//                System.out.println(number);
            }
            number++;
        }


        if (num == repeat){
            return 0;
        } else if (x) {
            return putNum(num, number, answer2, false, true, repeat+1);
        } else if (y) {
            return putNum(num, number, answer2, false, false, repeat+1);
        } else if (!y) {
            return putNum(num, number, answer2, true, true, repeat+1);
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();

        System.out.println(solution25.solution(5));
    }
}