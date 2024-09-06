package solved;

import java.util.Arrays;
import java.util.stream.Collectors;

class TailsWords {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(a->!a.contains(ex)).map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        TailsWords t = new TailsWords();

        System.out.println(t.solution(new String[]{"abc", "def", "ghi"}, "ef"));
    }
}