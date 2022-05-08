package solved;

import java.util.ArrayList;

class Solution69 {
    public int solution(int left, int right) {
        int answer = 0;
        ArrayList<Integer>[] measure = new ArrayList[right-left+1];

        for (int i=0; left+i<=right; i++){
            measure[i] = new ArrayList();
            for (int j=1; j<=left+i; j++){
                if ((left+i)%j==0){
                    measure[i].add(j);
                }
            }
        }

        for (int i=0; i< measure.length; i++){
            if (measure[i].size()%2==1){
                answer-=measure[i].get(measure[i].size()-1);
            } else {
                answer+=measure[i].get(measure[i].size()-1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution69 solution69 = new Solution69();

        System.out.println(solution69.solution(13, 17));
    }
}