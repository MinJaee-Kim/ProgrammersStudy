package solved;

import java.util.ArrayList;
import java.util.HashMap;

class Solution21 {
    public String[] solution(String[] record) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap();

        for (int i=0; i<record.length; i++){
            if (record[i].startsWith("Enter")){
                hashMap.put(record[i].substring(6, record[i].lastIndexOf(" ")), record[i].substring(record[i].lastIndexOf(" ")+1));
            } else if (record[i].startsWith("Change")) {
                hashMap.put(record[i].substring(7, record[i].lastIndexOf(" ")), record[i].substring(record[i].lastIndexOf(" ")+1));
            }
        }

        for (int i=0; i<record.length; i++){
            if (record[i].startsWith("Enter")){
                arrayList.add(hashMap.get(record[i].substring(6, record[i].lastIndexOf(" ")))+"님이 들어왔습니다.");
            } else if (record[i].startsWith("Leave")) {
                arrayList.add(hashMap.get(record[i].substring(record[i].lastIndexOf(" ")+1))+"님이 나갔습니다.");
            }
        }

        String[] answer = new String[arrayList.size()];

        for (int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        String[] asd = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        
        System.out.println(solution21.solution(asd));
    }
}