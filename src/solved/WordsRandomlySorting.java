package solved;

import java.util.Arrays;
import java.util.Comparator;

class Solution133 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1.toString().charAt(n)>o2.toString().charAt(n)) {
                    return 1;
                } else if (o1.toString().charAt(n)==o2.toString().charAt(n)) {
                    return o1.toString().compareTo(o2.toString());
                } else {
                    return -1;
                }
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        Solution133 solution133 = new Solution133();
        String[] strings = {"sun", "bed", "car"};

        System.out.println(solution133.solution(strings, 1));
    }
}