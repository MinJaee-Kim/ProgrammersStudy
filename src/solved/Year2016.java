package solved;

import java.util.Calendar;

class Solution72 {
    public String solution(int a, int b) {
        String answer = "";
        Calendar c = Calendar.getInstance();
        c.set(2016, a-1, b);

        int dow = c.get(Calendar.DAY_OF_WEEK);

        if(dow==1) answer = "SUN";
        else if(dow==2) answer = "MON";
        else if(dow==3) answer = "TUE";
        else if(dow==4) answer = "WED";
        else if(dow==5) answer = "THU";
        else if(dow==6) answer = "FRI";
        else if(dow==7) answer = "SAT";

        return answer;
    }


    public static void main(String[] args) {
        Solution72 solution72 = new Solution72();

        System.out.println(solution72.solution(5, 24));
    }
}