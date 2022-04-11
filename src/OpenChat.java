class Solution21 {
    public String[] solution(String[] record) {
        String[] answer = {};

        for (int i=0; i<record.length; i++){
            if (record[i].substring(0, 5).equals("Enter") ||
                    record[i].substring(0, 6).equals("Change")){
                for (int j=0; j<i; j++){
                    String pre="a";
                    String fix="b";
                    if (record[i].substring(0, 5).equals("Enter") ||
                            record[i].substring(0, 6).equals("Change")){
                        pre = record[i].substring(record[i].indexOf(" ")+1, record[i].lastIndexOf(" "));
                        fix = record[j].substring(record[j].indexOf(" ")+1, record[i].lastIndexOf(" "));
                    }

                    if (pre.equals(fix) && record[j].substring(0, 5).equals("Enter") || record[j].substring(0, 6).equals("Change")){
                        record[j] = record[i];
                    }
                }
            }
        }


        for (int i=0; i<record.length; i++) {
            System.out.println(record[i]);
        }

        return answer;
        //덜품
    }

    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        String[] asd = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        
        System.out.println(solution21.solution(asd));
    }
}