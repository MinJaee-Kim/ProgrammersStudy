package test;

public class SoulWareTest1 {
    public String solution(String s) {
        String answer = "";

        for (int i=s.length(); i>0; i--){
            answer+=s.charAt(i-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        SoulWareTest1 soulWareTest1 = new SoulWareTest1();

        System.out.println(soulWareTest1.solution("HELLO"));
    }
}
