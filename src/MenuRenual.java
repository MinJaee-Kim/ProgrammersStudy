//킵

import java.util.HashMap;

class Solution49 {
    HashMap<String, Integer> hashMap = new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        int max = 0;
        boolean isRepeat = false;

        for (int j=0; j< course.length; j++) {
            for (int i = 0; i < orders.length; i++) {
                boolean[] visited = new boolean[orders[i].length()];
                comb(orders, visited, 0, course[j], i);
            }
        }

        for (int i=0; i<course.length; i++) {
            for (String s : hashMap.keySet()) {
                if (s.length() == course[i]) {
                    if (!isRepeat) {
                        if (hashMap.get(s) > 1) {
                            if (max < hashMap.get(s)) {
                                max = hashMap.get(s);
                            }
                        }
                    } else {
                        if (max <= hashMap.get(s)) {
                            System.out.println(s);
                        }
                    }
                }
            }
            if (!isRepeat){
                isRepeat = true;
                i--;
            } else {
                max = 0;
                isRepeat = false;
            }
        }


        System.out.println(hashMap);

        return answer;
    }

    private void comb(String[] orders, boolean[] visited, int depth, int r, int i) {
        String value = "";
        if (r==0){
            for (int j=0; j< visited.length; j++){
                if (visited[j]){
                    value+=orders[i].charAt(j);
                }
            }
            hashMap.put(value, hashMap.getOrDefault(value, 0)+1);
            return;
        }

        if (depth==orders[i].length()){
            return;
        }
        visited[depth] = true;
        comb(orders, visited, depth + 1, r - 1, i);
        visited[depth] = false;
        comb(orders, visited, depth + 1, r, i);

    }

    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2,3,4};

        System.out.println(solution49.solution(orders, course));
    }
}