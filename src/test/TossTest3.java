package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TossTest3 {
    public boolean solution(String amountText) {
        boolean answer = true;
        String regex = "(?!0)\\\\d{1,3}(,\\\\d{3})*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(amountText);

        for (int i = 0; i < amountText.length(); i++) {

        }

        return answer;
    }

    public static void main(String[] args) {
        TossTest3 test = new TossTest3();
        String amountText = "39,00";

        System.out.println(test.solution(amountText));
    }
}
