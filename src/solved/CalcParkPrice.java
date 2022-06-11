package solved;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution73 {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, String> hashMap = new HashMap();
        Map<String, Integer> hashMap2 = new TreeMap<>();
        String val1;
        String val2;
        String left = "23:59";
        int value1 = 0;
        int value2 = 0;
        int sum = 0;
        int count = -1;

        for (int i=0; i<records.length; i++){
            if (records[i].endsWith("IN")){
                hashMap.put(records[i].substring(6, 10), records[i].substring(0, 5));
            } else if (records[i].endsWith("OUT")){
                val1 = hashMap.get(records[i].substring(6, 10));
                val2 = records[i].substring(0, 5);
                value1 = Integer.parseInt(val2.substring(0, 2))-Integer.parseInt(val1.substring(0, 2));
                value2 = Integer.parseInt(val2.substring(3, 5))-Integer.parseInt(val1.substring(3, 5));

                sum = (value1*60)+value2;

                hashMap2.put(records[i].substring(6, 10), hashMap2.getOrDefault(records[i].substring(6, 10), 0)+sum);
                hashMap.remove(records[i].substring(6, 10));
            }
        }

        for (String s : hashMap.keySet()){
            val1 = hashMap.get(s);
            value1 = Integer.parseInt(left.substring(0, 2))-Integer.parseInt(val1.substring(0, 2));
            value2 = Integer.parseInt(left.substring(3, 5))-Integer.parseInt(val1.substring(3, 5));

            sum = (value1*60)+value2;

            hashMap2.put(s, hashMap2.getOrDefault(s, 0)+sum);
        }

        int[] answer = new int[hashMap2.size()];

        for (String s : hashMap2.keySet()){
            count++;
            if (hashMap2.get(s)-fees[0]>0){
                answer[count] = (int) (fees[1] + Math.ceil((double) (hashMap2.get(s)-fees[0])/fees[2])*fees[3]);
            } else {
                answer[count] = fees[1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution73 solution73 = new Solution73();
        int[] fees = {120, 0, 60, 591};
        String[] records = {"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"};

        System.out.println(solution73.solution(fees, records));
    }
}