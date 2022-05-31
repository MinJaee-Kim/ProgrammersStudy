package solved;

import java.util.*;

class Solution49 {
    HashMap<String, Integer> hashMap = new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> arrayList = new ArrayList();
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
                        if (max <= hashMap.get(s) && hashMap.get(s)>=2) {
                            arrayList.add(s);
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

        Collections.sort(arrayList);

        String[] answer = new String[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    private void comb(String[] orders, boolean[] visited, int depth, int r, int i) {
        ArrayList<String> arrayList = new ArrayList();
        String value = "";
        if (r==0){
            for (int j=0; j< visited.length; j++){
                if (visited[j]){
                    arrayList.add(String.valueOf(orders[i].charAt(j)));
                }
            }
            Collections.sort(arrayList);
            for (int j=0; j<arrayList.size(); j++){
                value+=arrayList.get(j);
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