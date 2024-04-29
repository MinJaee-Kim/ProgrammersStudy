package solved;

public class FlipNumber {
    public int[] solution(long n) {
        int[] arr = new int[String.valueOf(n).length()];
        int index = String.valueOf(n).length()-1;

        for (String num : String.valueOf(n).split("")) {
            arr[index] = Integer.parseInt(num);
            index--;
        }

        return arr;
    }

    public static void main(String[] args) {
        FlipNumber f = new FlipNumber();

        System.out.println(f.solution(12345));
    }
}
