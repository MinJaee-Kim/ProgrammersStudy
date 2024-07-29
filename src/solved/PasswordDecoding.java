package solved;

// import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;

class PasswordDecoding {
    public String solution(String cipher, int code) {
        AtomicInteger index = new AtomicInteger();
        // return IntStream.range(0, cipher.length())
        //         .filter(value -> value % code == code - 1)
        //         .mapToObj(c -> String.valueOf(cipher.charAt(c)))
        //         .collect(Collectors.joining());
        
        return cipher.chars().mapToObj(c->(char) c).filter(e->index.getAndIncrement()%code==code-1).map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        PasswordDecoding p = new PasswordDecoding();

        System.out.println(p.solution("dfjardstddetckdaccccdegk", 4));
    }
}