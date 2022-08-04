package unsolved;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SoulWareTest4 {
    public String solution(String s) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (int i=0; i<30; i++) {
            Date today = new Date(2022, Calendar.SEPTEMBER, i);
            System.out.println(simpleDateFormat.format(today));
        }


        return "answer";
    }

    public static void main(String[] args) {
        SoulWareTest4 soulWareTest3 = new SoulWareTest4();

        System.out.println(soulWareTest3.solution("1234567890"));
    }
}
