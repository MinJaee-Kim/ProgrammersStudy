package unsolved;

class FlipWords {
    public String solution(String my_string) {
        String answer = "";
        for(String s:my_string.split("")){
            answer=s+answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        FlipWords f = new FlipWords();

        System.out.println(f.solution("jaron"));
    }
}