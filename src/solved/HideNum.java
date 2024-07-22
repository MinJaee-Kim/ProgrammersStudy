package solved;

import java.util.Arrays;

class HideNum {
    public int solution(String my_string) {
        return Arrays.stream(Arrays.stream(my_string.replaceAll("[a-zA-Z]", "").split("")).mapToInt(Integer::parseInt).toArray()).sum();
    }

    public static void main(String[] args) {
        HideNum h = new HideNum();

        System.out.println(h.solution("aAb1B2cC34oOp"));
    }
}