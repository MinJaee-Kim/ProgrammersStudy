import java.util.HashMap;

class Solution55 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : participant){
            hashMap.put(s, hashMap.getOrDefault(s, 0)+1);
        }

        for (String s : completion) {
            hashMap.put(s, hashMap.get(s)-1);
        }

        for (String s: hashMap.keySet()){
            if (hashMap.get(s)!=0){
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution55 solution55 = new Solution55();
        System.out.println(solution55.solution(participant, completion));
    }
}