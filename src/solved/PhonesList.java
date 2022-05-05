package solved;

import java.util.HashMap;

class Solution18 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hashMap = new HashMap();

        for (int i=0; i<phone_book.length; i++){
            hashMap.put(phone_book[i], i);
        }


        for (int i=0; i<phone_book.length; i++){
            for (int j=0; j< phone_book[i].length(); j++){
                if (hashMap.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution18 test = new Solution18();
        String[] testList = new String[]{"119", "97674223", "1195524421"};

        System.out.println(test.solution(testList));
    }
}