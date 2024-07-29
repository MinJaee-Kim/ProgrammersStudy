package solved;

import java.util.Arrays;
import java.util.Collections;

class MakeBiggestNum2 {
    public int solution(int[] numbers) {
        int max = 0;
        Integer[] minusArray = Arrays.stream(numbers).filter(i->i<0).boxed().toArray(Integer[]::new);
        Integer[] plusArray = Arrays.stream(numbers).filter(i->i>=0).boxed().toArray(Integer[]::new);
        Arrays.sort(minusArray);
        Arrays.sort(plusArray, Collections.reverseOrder());

        if(minusArray.length>1) max = minusArray[0]*minusArray[1]>max?minusArray[0]*minusArray[1]:max;
        if(plusArray.length>1) max = plusArray[0]*plusArray[1]>max?plusArray[0]*plusArray[1]:max;
        if(plusArray.length==1&&minusArray.length==1) max = plusArray[0]*minusArray[0];
        
        return max;
    }

    public static void main(String[] args) {
        MakeBiggestNum2 f = new MakeBiggestNum2();

        System.out.println(f.solution(new int[]{0, 1, -1}));
    }
}