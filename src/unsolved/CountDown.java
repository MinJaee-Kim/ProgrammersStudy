package unsolved;

import java.util.stream.IntStream;

class CountDown {
    public int[] solution(int start_num, int end_num) {
        return IntStream.range(end_num, start_num+1).map(n->start_num+end_num-n).toArray();
    }

    public static void main(String[] args) {
        CountDown c = new CountDown();

        System.out.println(c.solution(10, 3));
    }
}