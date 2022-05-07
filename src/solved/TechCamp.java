package solved;

import java.util.HashMap;

class Solution66 {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> hashMapx = new HashMap();
        HashMap<Integer, Integer> hashMapy = new HashMap();

        for (int i=0; i<v.length; i++){
            hashMapx.put(v[i][0], hashMapx.getOrDefault(v[i][0], 0)+1);
            hashMapy.put(v[i][1], hashMapy.getOrDefault(v[i][1], 0)+1);
        }

        for (Integer s:hashMapx.keySet()){
            if (hashMapx.get(s)==1){
                answer[0] = s;
            }
        }

        for (Integer s:hashMapy.keySet()){
            if (hashMapy.get(s)==1){
                answer[1] = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        int[][] v = {{1, 1}, {2, 2}, {1, 2}};

        System.out.println(solution66.solution(v));
    }
}