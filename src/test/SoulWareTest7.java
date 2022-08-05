package test;

public class SoulWareTest7 {
    public String solution(String s) {

        repeat(s, 0);

        return "answer";
    }

    private String repeat(String num, int depth) {
        if (depth>=5){
            return "";
        }
        String val = "";
        char pre = num.charAt(0);
        int count = 1;

        for (int i=1; i<num.length(); i++){
            if (pre==num.charAt(i)){
                count++;
            } else {
                val+=pre+String.valueOf(count);
                count = 1;
                pre = num.charAt(i);
            }
        }
        val+=pre+String.valueOf(count);
        System.out.println(val);

        repeat(val, depth+1);

        return val;
    }

    public static void main(String[] args) {
        SoulWareTest7 soulWareTest7 = new SoulWareTest7();

        System.out.println(soulWareTest7.solution("1"));
    }
}
