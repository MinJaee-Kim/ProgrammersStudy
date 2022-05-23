package solved;

import java.util.HashMap;

class Solution59 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int count = 1;
        int people = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(words[0], 1);
        for (int i=0; i< words.length-1; i++){
            if (people<n) {
                people++;
            } else {
                people = 1;
                count++;
            }

            if (!hashMap.containsKey(words[i+1])){
                hashMap.put(words[i+1], 1);
            } else {
                break;
            }

            if (!(words[i].charAt(words[i].length()-1)==words[i+1].charAt(0))){
                break;
            }

            if (i == words.length-2){
                people=0;
                count=0;
            }

        }

        answer[0] = people;
        answer[1] = count;

        return answer;
    }

    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        System.out.println(solution59.solution(3, words));
    }
}