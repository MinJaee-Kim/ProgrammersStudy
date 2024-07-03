package unsolved;

import java.util.Arrays;

class OddEvenNums {
    public int[] solution(int[] num_list) {
        int[] answer = {(int) Arrays.stream(num_list).filter((n)->n/2==0).count(),
            (int) Arrays.stream(num_list).filter((n)->n/2!=0).count()};
        return answer;
    }

    public static void main(String[] args) {
        OddEvenNums o = new OddEvenNums();
        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println(o.solution(num_list));
    }
}