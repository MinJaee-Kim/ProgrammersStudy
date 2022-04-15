import java.util.ArrayList;

class Solution21 {
    public String[] solution(String[] record) {
        ArrayList answer = new ArrayList<String>();

        for (int i=0; i<record.length; i++){
            for (int j=0; j<=i; j++){
                if (record[i].substring(record[i].indexOf(" ")+1, record[i].lastIndexOf(" ")+1)
                        .equals(record[j].substring(record[j].indexOf(" ")+1, record[j].lastIndexOf(" ")+1))){
                    record[j] = record[j].replace(record[j].substring(record[j].lastIndexOf(" ")+1), record[i].substring(record[i].lastIndexOf(" ")+1));
                } else if (record[j].substring(record[j].indexOf(" "))
                        .equals(record[i].substring(record[i].indexOf(" "), record[i].lastIndexOf(" ")))) {
                    record[j] = record[j] + record[i].substring(record[i].lastIndexOf(" "));
                }
            }
        }

        for (int i=0; i<record.length; i++){
            if (record[i].startsWith("Enter")){
                answer.add(record[i].substring(record[i].lastIndexOf(" ")+1)+"님이 들어왔습니다.");
            } else if (record[i].startsWith("Leave")) {
                answer.add(record[i].substring(record[i].lastIndexOf(" ")+1)+"님이 나갔습니다.");
            }
        }

        String[] array = new String[answer.size()];

        for (int i=0; i< answer.size(); i++){
            array[i] = (String) answer.get(i);
        }

        return array;
    }

    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        String[] asd = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        
        System.out.println(solution21.solution(asd));
    }
}