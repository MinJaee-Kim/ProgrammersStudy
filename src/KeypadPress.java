class Solution9 {
    String answer = "";
    int[] left = {0, 3};
    int[] right = {2, 3};
    public String solution(int[] numbers, String hand) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                if (numbers[i]==1) {
                    left = new int[]{0, 0};
                } else if (numbers[i]==4) {
                    left = new int[]{0, 1};
                } else if (numbers[i]==7) {
                    left = new int[]{0, 2};
                }

                answer = answer + "L";

            } else if (numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
                if (numbers[i]==3) {
                    right = new int[]{2, 0};
                } else if (numbers[i]==6) {
                    right = new int[]{2, 1};
                } else if (numbers[i]==9) {
                    right = new int[]{2, 2};
                }

                answer = answer + "R";
            } else {
                position(left, right, numbers[i], hand);
            }
        }


        return answer;
    }

    public void position(int[] left, int[] right, int numbers, String hand) {
        int[] position = new int[1];

        if (numbers==2) {
            position = new int[]{1, 0};
        } else if (numbers==5) {
            position = new int[]{1, 1};
        } else if (numbers==8) {
            position = new int[]{1, 2};
        } else if (numbers==0) {
            position = new int[]{1, 3};
        }

        int leftX = Math.abs(left[0]-position[0]);
        int leftY = Math.abs(left[1]-position[1]);
        int rightX = Math.abs(right[0]-position[0]);
        int rightY = Math.abs(right[1]-position[1]);


        if (leftX+leftY == rightX+rightY) {
            if (hand.equals("right")){
                this.right = position;
                answer = answer + "R";
                return;
            } else {
                this.left = position;
                answer = answer + "L";
                return;
            }
        } else if (leftX+leftY > rightX+rightY){
            this.right = position;
            answer = answer + "R";
            return;
        } else {
            this.left = position;
            answer = answer + "L";
            return;
        }
    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        System.out.println(solution9.solution(numbers, hand));
    }
}