import java.util.HashSet;
import java.util.Iterator;

class Solution32 {
    public int solution(int N, int number) {
        int answer = 0;
        HashSet hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet<>();
        String[] arr = {String.valueOf(N), "+"+N, "-"+N, "*"+N, "/"+N};
        boolean[] visited = new boolean[arr.length];

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

        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (k%2==0) {
                    Iterator iterator = hashSet.iterator();
                    Integer parameter = (Integer) iterator.next();
                    int value = 0;
                    String val = "";
                    for (int j = 0; j < hashSet.size(); j++) {
                        if (arr[i].startsWith("+")){
                            value = parameter + Integer.parseInt(arr[i].substring(1));
                        } else if (arr[i].startsWith("-")){
                            value = parameter - Integer.parseInt(arr[i].substring(1));
                        } else if (arr[i].startsWith("*")){
                            value = parameter * Integer.parseInt(arr[i].substring(1));
                        } else if (arr[i].startsWith("/")){
                            value = parameter / Integer.parseInt(arr[i].substring(1));
                        } else {
                            val = parameter.toString()+val;
                            hashSet2.add(val);
                        }
                        hashSet2.add(value);
                    }
                }

//                if (k%2==1) {
//                    Iterator iterator = hashSet2.iterator();
//                    Integer parameter = (Integer) iterator.next();
//                    for (int j = 0; j < hashSet2.size(); j++) {
//                        hashSet.add(parameter + arr[i]);
//                    }
//                }
            }
        }


//        while (iterator.hasNext()) {
//            System.out.println(hashSet2.iterator().next());
//        }
        System.out.println(hashSet2);

        return answer;
    }


    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();

        System.out.println(solution32.solution(5, 12));
    }
}