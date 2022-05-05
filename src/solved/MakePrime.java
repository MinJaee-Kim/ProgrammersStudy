package solved;

import java.util.ArrayList;

class Solution26 {
    ArrayList<Integer> arrayList = new ArrayList();
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] visited = new boolean[nums.length];

        comb(nums, visited, 0, 3);

        for (int i=0; i<arrayList.size(); i++){
            if (isPrime(arrayList.get(i))){
                answer++;
            }
        }

        return answer;
    }

    public void comb(int[] arr, boolean[] visited, int depth, int r) {
        int answer = 0;
        if (r == 0) {
            for (int i=0; i<visited.length; i++) {
                if (visited[i]){
                    answer += arr[i];
                }
            }
            arrayList.add(answer);
            return;
        }
        if (depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth+1, r-1);

            visited[depth] = false;
            comb(arr, visited, depth+1, r);
        }
    }

    public boolean isPrime(int num) {
        for (int i=num-1; i>1; i--){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int[] nums = {1,2,7,6,4};

        System.out.println(solution26.solution(nums));
    }
}