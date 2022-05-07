package unsolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution62 {
    public int[] solution(int[] arr) {
        Integer[] copy = new Integer[arr.length];
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i=0; i<arr.length; i++){
            copy[i] = arr[i];
        }

        if (arr.length==1){
            arrayList.add(-1);
        } else {
            Arrays.sort(copy, Collections.reverseOrder());
            for (int i=0; i<copy.length; i++){
                if (copy[copy.length-1]==copy[i]) {
                    continue;
                }

                arrayList.add(copy[i]);
            }
        }

        int[] answer = new int[arrayList.size()];

        for (int i=0; i<arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }

        for (int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution62 solution62 = new Solution62();
        int[] arr = {4,3,2,1,1,1};

        System.out.println(solution62.solution(arr));
    }
}