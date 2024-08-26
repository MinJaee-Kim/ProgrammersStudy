package unsolved;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArray {
    public int[] solution(int n, int k) {
        return Arrays.stream(IntStream.rangeClosed(1, n).toArray()).filter(num->num%k==0).toArray();
    }

    public static void main(String[] args) {
        MakeArray m = new MakeArray();

        System.out.println(m.solution(10, 3));
    }
}
