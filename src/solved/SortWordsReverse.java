package solved;

import java.util.Arrays;
import java.util.Comparator;

class Solution114 {
    public String solution(String s) {
        String[] sp = s.split("");

        Arrays.sort(sp, Comparator.reverseOrder());
        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0; i<sp.length; i++){
            stringBuffer.append(sp[i]);
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Solution114 solution114 = new Solution114();

        System.out.println(solution114.solution("Zbcdefg"));
    }
}