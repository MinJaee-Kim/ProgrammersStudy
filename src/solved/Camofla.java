package solved;

import java.util.HashMap;

class Solution19 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i=0; i<clothes.length; i++){
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 1)+1);
        }

        for (String key:hashMap.keySet()){
            answer*=(hashMap.get(key));
        }

        return answer-1;
    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        System.out.println(solution19.solution(clothes));
    }
}