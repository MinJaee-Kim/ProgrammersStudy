package solved;

import java.util.Arrays;

class ArraysLength {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(a->a.length()).toArray();
    }

    public static void main(String[] args) {
        ArraysLength al = new ArraysLength();
        String[] strlist = {"We", "are", "the", "world!"};

        System.out.println(al.solution(strlist));
    }
}