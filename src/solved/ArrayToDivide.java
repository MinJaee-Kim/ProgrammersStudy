package solved;

import java.util.ArrayList;
import java.util.Arrays;

class Solution125 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList();
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){
            if (arr[i]%divisor==0){
                arrayList.add(arr[i]);
            }
        }

        if (arrayList.size()==0){
            arrayList.add(-1);
        }


        return arrayList;
    }

    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        int[] arr = {5, 9, 7, 10};

        System.out.println(solution125.solution(arr, 5));
    }
}
