import java.util.ArrayList;

class Solution31 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        ArrayList<Integer> arrayList = new ArrayList();
        int isBrown = 0;

        for (int i=1; i<=brown+yellow; i++){
            if ((brown+yellow)%i==0){
                arrayList.add(i);
            }
        }

        for (int i=0; i< arrayList.size()+1/2; i++){
            for (int j=0; j< arrayList.get(i); j++){
                for (int k=0; k< arrayList.get(arrayList.size()-i-1); k++){
                    if (j==0 || j==arrayList.get(i-1) || k==0 || k==arrayList.get(arrayList.size()-i-2)){
                        isBrown++;
                    }
                }
            }
            if (brown==isBrown){
                answer[0] = arrayList.get(arrayList.size()-i-1);
                answer[1] = arrayList.get(i);
                break;
            }

            isBrown=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();

        System.out.println(solution31.solution(8, 1));
    }
}