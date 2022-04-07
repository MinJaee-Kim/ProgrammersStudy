import java.util.ArrayList;
import java.util.HashMap;

//푸는중
class Solution24 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int count=0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> reported = new ArrayList<>();

        for (int i=0; i< report.length; i++){
            hashMap.put(report[i].substring(report[i].indexOf(" ")), hashMap.getOrDefault(report[i].substring(report[i].indexOf(" ")), 0)+1);
//            System.out.println(report[i].substring(report[i].indexOf(" ")));
//            System.out.println(report[i].substring(0, report[i].indexOf(" ")));
        }

        for (String key : hashMap.keySet()){
            if (hashMap.get(key)>=k){
                reported.add(key);
            }
        }

        for (int i=0; i< report.length; i++){
            for (int j=0; j< reported.size(); j++){

            }
        }



        return answer;
    }


    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int K = 2;

        Solution24 solution24 = new Solution24();

        System.out.println(solution24.solution(id_list, report, K));
    }
}
