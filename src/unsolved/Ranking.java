package unsolved;

import java.util.ArrayList;

class Solution118 {
    public int solution(int n, int[][] results) {
        int answer = 0;
        ArrayList<ArrayList<String[]>> arrayList = new ArrayList();

        for (int i=0; i< n; i++){
            arrayList.add(new ArrayList<>());
        }

        for (int i=0; i< results.length; i++) {
            arrayList.get(results[i][1]-1).add(new String[]{"lose", String.valueOf(results[i][0]-1)});
            arrayList.get(results[i][0]-1).add(new String[]{"win", String.valueOf(results[i][1]-1)});
        }

        for (int i=0; i< arrayList.size(); i++) {
            if (arrayList.get(i).size()==n-1){
                for (int j=0; j< arrayList.get(i).size(); j++) {
                    if (arrayList.get(i).get(j)[0].equals("win")){
                        arrayList.get(Integer.parseInt(arrayList.get(i).get(j)[1])).addAll(arrayList.get(i));
                        arrayList.get(Integer.parseInt(arrayList.get(i).get(j)[1])).remove(arrayList.get(i).get(j));
                    } else {
                        
                    }
                }
            }
        }

        for (int i=0; i< arrayList.size(); i++) {
            if (arrayList.get(i).size()==n-1){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        int[][] result = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};


        System.out.println(solution118.solution(5, result));
    }
}