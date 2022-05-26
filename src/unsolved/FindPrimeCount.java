package unsolved;

import java.util.LinkedList;

class Solution61 {
    int cnt = 1;
    LinkedList linkedList = new LinkedList();
    public int solution(int n) {
        int answer = 0;

        prime(n);

        return cnt;
    }

    private void prime(int n) {
        if (n==1)
            return;

        for (int i=2; i<n; i++){
            if (n%i==0 || linkedList.contains(i)){
                break;
            } else if (i==n-1){
                cnt++;
                linkedList.add(i);
            }
        }
        prime(n-1);

        return;
    }

    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();

        System.out.println(solution61.solution(10));
    }
}