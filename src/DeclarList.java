import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Solution24 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        HashMap<String, Integer> hashMap = new HashMap<>();
        Iterator iterator = hashSet.iterator();


        while (iterator.hasNext()){
            String Dec = (String) iterator.next();
            hashMap.put(Dec.substring(Dec.indexOf(" ")+1), hashMap.getOrDefault(Dec.substring(Dec.indexOf(" ")+1), 0)+1);
        }

        for (int i=0; i< report.length; i++){
            if (hashMap.get(report[i].substring(report[i].indexOf(" ")+1))>=k){
                for (int j=0; j< id_list.length; j++){
                    if (report[i].substring(0, report[i].indexOf(" ")).equals(id_list[j])){
                        answer[j]++;
                    }
                }
            }
        }

        for (int i=0; i< answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }


    public static void main(String[] args) {
        String[] id_list = {"frodo", "muzi", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int K = 2;

        Solution24 solution24 = new Solution24();

        System.out.println(solution24.solution(id_list, report, K));
    }
}
