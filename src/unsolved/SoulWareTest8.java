package unsolved;

import java.util.regex.Pattern;

public class SoulWareTest8 {
    public String solution(String s) {
        String answer = "";
        Character[] characters = new Character[]{'+','=','%','_','!','@','#','$','^','&','*','?'};
        boolean isNum = false;
        boolean isSpecial = false;
        boolean isEng = false;
        Pattern pattern1 = Pattern.compile("^[0-9]*$");
        Pattern pattern2 = Pattern.compile("^[a-zA-Z]");
        Pattern pattern3 = Pattern.compile("[0-9]");

//        for (int i=0; i<s.length(); i++){
//            if (){
//
//            }
//        }

        return "answer";
    }

    public static void main(String[] args) {
        SoulWareTest8 soulWareTest3 = new SoulWareTest8();

        System.out.println(soulWareTest3.solution("1q2w3er4r!"));
    }
}
