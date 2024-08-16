package unsolved;

public class ReadVertical {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int index = 0;
        int countC = 0;
        while (my_string.length()>index) {
            if(countC+1==c) answer+=my_string.charAt(index);
            if(countC+1==m) countC = 0;
            else countC++;
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        ReadVertical r = new ReadVertical();

        System.out.println(r.solution("ihrhbakrfpndopljhygc", 4, 2));
    }
}
