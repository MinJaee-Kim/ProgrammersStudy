package solved;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : participant){
            hashMap.put(s, hashMap.getOrDefault(s, 0)+1);
        }

        for (String s : completion) {
            hashMap.put(s, hashMap.get(s)-1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}