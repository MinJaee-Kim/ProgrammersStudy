package unsolved;

import java.util.*;

class Solution36 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> hashMap = new HashMap();
        HashMap<Integer, String> hashMap2 = new HashMap();

        for (int i=0; i< genres.length; i++){
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0)+plays[i]);
            hashMap2.put(plays[i], genres[i]);
        }
        Integer[] mapKey = hashMap2.keySet().toArray(new Integer[0]);
        Integer[] topKey = hashMap.values().toArray(new Integer[0]);
        Arrays.sort(mapKey, Comparator.reverseOrder());
        Arrays.sort(topKey, Comparator.reverseOrder());



        System.out.println(hashMap);
        System.out.println(hashMap2);

        return answer;
    }

    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution36.solution(genres, plays));
    }
}