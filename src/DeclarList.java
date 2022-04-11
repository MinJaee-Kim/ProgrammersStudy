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
            //키값에 해당하는 유저 +1
            String Dec = (String) iterator.next();
            hashMap.put(Dec.substring(Dec.indexOf(" ")+1), hashMap.getOrDefault(Dec.substring(Dec.indexOf(" ")+1), 0)+1);
        }

        Iterator iterator2 = hashSet.iterator();

        while (iterator2.hasNext()){
            //신고한 유저에게 answer+1
            String Dec2 = (String) iterator2.next();
            if (hashMap.get(Dec2.substring(Dec2.indexOf(" ")+1))>=k){
                for (int j=0; j< id_list.length; j++){
                    if (Dec2.substring(0, Dec2.indexOf(" ")).equals(id_list[j])){
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
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","apeach frodo","frodo neo","muzi neo","muzi neo","apeach muzi"};
        int K = 2;

        Solution24 solution24 = new Solution24();

        System.out.println(solution24.solution(id_list, report, K));
    }
}
