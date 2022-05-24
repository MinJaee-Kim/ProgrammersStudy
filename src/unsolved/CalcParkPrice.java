package unsolved;

import java.util.HashMap;

class Solution73 {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        HashMap<String, String> hashMap = new HashMap();


        for (int i=0; i< records.length; i++) {
            if (records[i].endsWith("IN")) {
                hashMap.put(records[i].substring(6, 10), hashMap.getOrDefault(records[i].substring(6, 10), "") + records[i].substring(0, 5));
            } else {
//                hashMap.put(records[i].substring(6, 10), hashMap.getOrDefault(records[i].substring(6, 10), "") + 1);
            }
        }

        System.out.println(hashMap);

        return answer;
    }

    public static void main(String[] args) {
        Solution73 solution73 = new Solution73();
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN",
                "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN",
                "23:00 5961 OUT"};

        System.out.println(solution73.solution(fees, records));
    }
}