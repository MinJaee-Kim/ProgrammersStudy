package unsolved;

import java.util.stream.IntStream;

class PasswordDecoding {
    public String solution(String cipher, int code) {
        System.out.println(IntStream.range(0, cipher.length()).filter(i->i%code==0).mapToObj(i->cipher.charAt(i)).toArray(String[]::new));
        return "";
    }

    public static void main(String[] args) {
        PasswordDecoding p = new PasswordDecoding();

        System.out.println(p.solution("dfjardstddetckdaccccdegk", 4));
    }
}