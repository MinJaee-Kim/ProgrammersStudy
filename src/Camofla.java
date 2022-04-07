import java.util.HashMap;

class Solution19 {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i=0; i<clothes.length; i++){
            hashMap.put(clothes[i][1], clothes[i][0]);
        }

        for (int i=0; i<hashMap.size(); i++){

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        System.out.println(solution19.solution(clothes));
    }
}