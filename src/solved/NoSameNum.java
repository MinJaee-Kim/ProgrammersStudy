package solved;

import java.util.*;

class Solution70 {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i=0; i< arr.length-1; i++){
            if (arr[i]==arr[i+1]){
                continue;
            } else {
                arrayList.add(arr[i]);
            }
        }

        arrayList.add(arr[arr.length-1]);

        int[] answer = new int[arrayList.size()];

        for (int i=0; i< arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        int[] arr = {1,1,3,3,0,1,1};

        System.out.println(solution70.solution(arr));
    }
}