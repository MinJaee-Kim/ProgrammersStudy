package solved;

public class PlusNumber {
    private int solution(int n) {
        int answer = 0;

        for (String s: String.valueOf(n).split("")) {
            answer+=Integer.parseInt(s);
        }

        return answer;
    }
    private static void main(String[] args) {
        PlusNumber plusNumber = new PlusNumber();

        System.out.println(plusNumber.solution(123));
    }
}
