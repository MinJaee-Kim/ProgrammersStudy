package solved;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class FindBiggestNumber {
    public int[] solution(int[] array) {
        Integer[] boxArrat = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxArrat, Comparator.reverseOrder());

        int index = IntStream.range(0, array.length)
        .filter(i->array[i]==boxArrat[0])
        .findFirst().orElse(-1);
        
        return new int[]{boxArrat[0],index};
    }

    public static void main(String[] args) {
        FindBiggestNumber f = new FindBiggestNumber();

        System.out.println(f.solution(new int[]{1, 8, 3}));
    }
}