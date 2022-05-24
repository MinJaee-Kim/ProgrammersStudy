package solved;

import java.util.*;

class Solution36 {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answerList = new ArrayList();
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        int count = 0;

        for (int i=0; i< genres.length; i++) {
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0)+plays[i]);
        }

        List<String> keySetList = new ArrayList(hashMap.keySet());
        Collections.sort(keySetList, (o1, o2) -> hashMap.get(o2).compareTo(hashMap.get(o1)));

        for (String key : keySetList) {
            for (int i=0; i< genres.length; i++) {
                if (key.equals(genres[i])){
                    hashMap2.put(i, plays[i]);
                }
            }
            List<Integer> keySetList2 = new ArrayList(hashMap2.keySet());
            Collections.sort(keySetList2, (o1, o2) -> hashMap2.get(o2).compareTo(hashMap2.get(o1)));

            for (Integer key2 : keySetList2){
                if (count==2)
                    break;
                answerList.add(key2);
                count++;
            }
            hashMap2.clear();
            count=0;
        }

        int[] answer = new int[answerList.size()];
        for (int i=0; i< answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution36.solution(genres, plays));
    }
}