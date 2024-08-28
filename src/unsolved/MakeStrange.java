package unsolved;

public class MakeStrange {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for(String word:s.split("")){
            answer+=index%2==1?word.toLowerCase():word.toUpperCase();
            index=word.equals(" ")?0:index+1;
        }
        return answer;
    }
    public static void main(String[] args) {
        MakeStrange makeStrange = new MakeStrange();

        System.out.println(makeStrange.solution("try hello world"));
    }
}
