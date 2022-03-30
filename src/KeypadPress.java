//덜 품
class Solution9 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 8;
        int right = 8;
        boolean isLeft = false;
        boolean isRight = false;
        int middle = 0;

        StringBuilder sb = new StringBuilder("");


        for (int i=0; i< numbers.length; i++){
            if (numbers[i]==1||numbers[i]==4||numbers[i]==7) {
                sb.append("L");
                if (numbers[i]==1){
                    left = 2;
                }else if (numbers[i]==4){
                    left = 4;
                }else if (numbers[i]==7) {
                    left = 6;
                }
                isLeft = false;
            }
            if (numbers[i]==2||numbers[i]==5||numbers[i]==8||numbers[i]==0){
                if (numbers[i]==2){
                    middle = 2;
                }else if (numbers[i]==5){
                    middle = 4;
                }else if (numbers[i]==8){
                    middle = 6;
                }else if (numbers[i]==0){
                    middle = 8;
                }

                if (isLeft){
                    if (left==middle){
                        sb.append("L");
                        right = middle;
                        isRight = true;
                        continue;
                    }
                    if (left>middle){
                        left-=2;
                    }else {
                        left+=2;
                    }
                }

                if (isRight){
                    if (right==middle){
                        sb.append("R");
                        left = middle;
                        isLeft = true;
                        continue;
                    }
                    if (right>middle){
                        right-=2;
                    }else {
                        right+=2;
                    }
                }

                if (Math.abs(left-middle)==Math.abs(right-middle)){
                    if (hand.equals("right")){
                        sb.append("R");
                        right = middle;
                        isRight = true;
                    }else if (hand.equals("left")){
                        sb.append("L");
                        left = middle;
                        isLeft = true;
                    }
                } else if (Math.abs(left-middle)>Math.abs(right-middle)){
                    sb.append("R");
                    right = middle;
                    isRight = true;
                } else if (Math.abs(left-middle)<Math.abs(right-middle)){
                    sb.append("L");
                    left = middle;
                    isLeft = true;
                }

            }
            if (numbers[i]==3||numbers[i]==6||numbers[i]==9) {
                sb.append("R");
                if (numbers[i]==3){
                    right = 2;
                }else if (numbers[i]==6){
                    right = 4;
                }else if (numbers[i]==9) {
                    right = 6;
                }
                isRight = false;
            }
        }

        answer = sb.toString();

        return answer;
    }
}