import java.util.HashSet;
import java.util.Iterator;


//덜 품
class Solution32 {
    public int solution(int N, int number) {
        int answer = 0;
        HashSet hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet<>();
        String[] arr = {String.valueOf(N), "+"+N, "-"+N, "*"+N, "/"+N};

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

        int repeat = 0;
        hashSet.add(N);
        Iterator iterator = hashSet.iterator();
        int num;

        while (repeat <= 8) {
            if (!iterator.hasNext()){
                repeat++;
                iterator = hashSet.iterator();
            }
            else
            {
                num = (int) iterator.next();
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].charAt(0) == '+') {
//                        System.out.println(num+N);
                        hashSet.add(num+N);
                    } else if (arr[j].charAt(0) == '-') {
//                        if (num-N<0){
//                            continue;
//                        }
                        hashSet.add(num-N);
                    } else if (arr[j].charAt(0) == '*') {
                        hashSet.add(num*N);
                    } else if (arr[j].charAt(0) == '/') {
                        hashSet.add(num/N);
                    } else {
                        String addnum = "";
                        addnum = num + String.valueOf(N);
                        hashSet.add(Integer.parseInt(addnum));
                    }
                }
                System.out.println(hashSet);
                System.out.println(repeat);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();

        System.out.println(solution32.solution(5, 12));
    }
}