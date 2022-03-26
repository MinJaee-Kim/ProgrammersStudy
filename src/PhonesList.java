import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class Solution18 {
    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//
//        HashMap<String, Integer> hashMap = new HashMap();
//
//        Arrays.sort(phone_book, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (Integer.parseInt(o1) < Integer.parseInt(o2)) {
//                    return -1;
//                } else if (Integer.parseInt(o1) > Integer.parseInt(o2)) {
//                    return 1;
//                }
//                return 0;
//            }
//        });
//
//        for (int i=0; i<phone_book.length; i++){
//            hashMap.put(phone_book[i], i);
//        }
//
//
//        for (int i=0; i<phone_book.length; i++){
//            for (int j=i+1; j< phone_book.length; j++){
//                if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//
//        return answer;
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