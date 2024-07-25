package solved;

import java.util.stream.Collectors;

class SwapeWord {
    public String solution(String my_string) {
        return my_string.chars().mapToObj(c -> (char) c).map(c->c>90?c.toUpperCase(c):c.toLowerCase(c)).map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        SwapeWord s = new SwapeWord();

        System.out.println(s.solution("abCdEfghIJ"));
    }
}