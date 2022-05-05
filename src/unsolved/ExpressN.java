package unsolved;

import java.util.HashSet;
import java.util.Iterator;


//덜 품
class Solution32 {
    public int solution(int N, int number) {
        int answer = 0;
        HashSet hashSet = new HashSet<>();

        //dp
//        int d[] = new int[number+1];
//        for (int i=1; i<number; i++){
//            d[i] = -1;
//            for (int j=0; j<0; j++){
//                if (d[i]-N<0)
//                    continue;
//                if (d[i] < 0) d[i] = d[i - N] + 1;
//                else if (d[i - N] + 1 < d[i]) d[i] = d[i - N] + 1;
//            }
//        }

        hashSet.add(N);

        for (int i=0; i<9; i++){
            Iterator iterator = hashSet.iterator();
            Object num;
            while (iterator.hasNext()){
                num = iterator.next();
                hashSet.add(Integer.parseInt(num.toString())+N);
                hashSet.add(Integer.parseInt(num.toString())*N);
                hashSet.add(Integer.parseInt(num.toString())-N);
                hashSet.add(Integer.parseInt(num.toString())/N);
                hashSet.add(num +String.valueOf(N));
            }
            num = null;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();

        System.out.println(solution32.solution(5, 12));
    }
}