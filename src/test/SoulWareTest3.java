package test;

import java.util.ArrayList;
import java.util.Random;

public class SoulWareTest3 {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList();

        while (answer.length()<s.length()){
            index = random.nextInt(s.length());
            if (!arrayList.contains(index)){
                arrayList.add(index);
                answer+=s.charAt(index);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SoulWareTest3 soulWareTest3 = new SoulWareTest3();

        System.out.println(soulWareTest3.solution("1234567890"));
    }
}
