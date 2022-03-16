import java.util.Arrays;
import java.util.Comparator;

class Solution18 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.parseInt(o1) < Integer.parseInt(o2)) {
                    return -1;
                } else if (Integer.parseInt(o1) > Integer.parseInt(o2)) {
                    return 1;
                }
                return 0;
            }
        });

        for (int i=0; i< phone_book.length; i++) {
            for (int j = 0; j < phone_book.length; j++){
                if (i == j) {
                    continue;
                }

                if (phone_book[i].startsWith(phone_book[j])) {
                    answer = false;

                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution18 test = new Solution18();
        String[] testList = new String[]{"987987", "1"};

        System.out.println(test.solution(testList));
    }
}