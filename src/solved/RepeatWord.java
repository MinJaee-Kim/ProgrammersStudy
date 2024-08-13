package solved;

public class RepeatWord {
    public String solution(String my_string, int n) {
        String answer = "";
        int index = 0;
        int charIndex = 0;
        while(my_string.length()*n>answer.length()){
            answer+=my_string.charAt(charIndex);
            index=n>index?index+1:1;
            charIndex=index>=n?charIndex+1:charIndex;
        }
        return answer;
    }
    public static void main(String[] args) {
        RepeatWord r = new RepeatWord();

        System.out.println(r.solution("hello", 3));
    }
}
