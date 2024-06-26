package solved;

import java.util.Arrays;

public class LetestWord {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] store = new int[200];

        Arrays.fill(store, -1);

        for(int i=0; i<s.length(); i++){
            int intValue = s.charAt(i);
            if(store[intValue]!=-1) {
                answer[i] = i-store[intValue];
                store[intValue] = i;
            } else {
                store[intValue] = i;
                answer[i] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LetestWord l = new LetestWord();

        System.out.println(l.solution("aaabbbccc"));
    }
}
