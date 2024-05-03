package solved;

public class BetweenNum {
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        while (min <= max) {
            answer+=min;
            min++;
        }
        return answer;
    }
    public static void main(String[] args) {
        BetweenNum b = new BetweenNum();
        System.out.println(b.solution(3, 5));
    }
}
