package solved;

import java.util.Arrays;
import java.util.stream.IntStream;

class ChangeOrder {
    public int[] solution(int[] num_list, int n) {
        return IntStream.concat(Arrays.stream(Arrays.copyOfRange(num_list, n, num_list.length)),
         Arrays.stream(Arrays.copyOfRange(num_list, 0, n))).toArray();
    }

    public static void main(String[] args) {
        ChangeOrder c = new ChangeOrder();
        int[] num_list = {5, 2, 1, 7, 5};


        System.out.println(c.solution(num_list, 3));
    }
}