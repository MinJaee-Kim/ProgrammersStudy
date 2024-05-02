package solved;

public class OddAndEven {
    public String solution(int num) {
        if(num % 2 == 0) return "Even";
        else return "Odd";
    }
    public static void main(String[] args) {
        OddAndEven o = new OddAndEven();

        System.out.println(o.solution(1));
    }
}
