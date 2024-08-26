package unsolved;

import java.util.HashMap;

public class ControlNumber {
    public int solution(int n, String control) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int answer = n;
        hashMap.put("w", 1);
        hashMap.put("s", -1);
        hashMap.put("d", 10);
        hashMap.put("a", -10);

        for(String c:control.split("")){
            answer+=hashMap.get(c);
        }

        return answer;
    }

    public static void main(String[] args) {
        ControlNumber c = new ControlNumber();

        System.out.println(c.solution(0, "wsdawsdassw"));
    }
}
