class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int best=0, worst=0;


        for (int i=0; i<lottos.length; i++){
            for (int j=0; j<win_nums.length; j++){
                if (lottos[i] == win_nums[j]){
                    best += 1;
                    worst += 1;
                }
            }
            if(lottos[i]==0){
                best += 1;
            }
        }

        if(best >= 6){
            answer[0] = 1;
        }else if(best >= 5){
            answer[0] = 2;
        }else if(best >= 4){
            answer[0] = 3;
        }else if(best >= 3){
            answer[0] = 4;
        }else if(best >= 2){
            answer[0] = 5;
        }else{
            answer[0] = 6;
        }

        if(worst >= 6){
            answer[1] = 1;
        }else if(worst >= 5){
            answer[1] = 2;
        }else if(worst >= 4){
            answer[1] = 3;
        }else if(worst >= 3){
            answer[1] = 4;
        }else if(worst >= 2){
            answer[1] = 5;
        }else{
            answer[1] = 6;
        }


        return answer;
    }
}