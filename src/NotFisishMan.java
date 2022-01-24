import java.util.Arrays;

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int i=0;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (i=0; i< completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                answer = participant[i];
        }

        if (answer.equals(""))
            answer = participant[i];



        return String.valueOf(i);
    }
}