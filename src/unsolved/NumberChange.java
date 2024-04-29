package unsolved;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class NumberChange {
    public int solution(int x, int y, int n) {
        int index = 1;
        int[] dp = new int[y+1];
        dp[y] = index;

        while(index<5){
            index++;
            dp[y/2] = index;
            dp[y/3] = index;
            dp[y-n] = index;

            if(y/2==x||y/3==x||y-n==x) break;
        }

        return index;
    }

    public static void main(String[] args) {
        NumberChange numberChange = new NumberChange();
        int x = 10;
        int y = 40;
        int n = 15;

        System.out.println(numberChange.solution(x, y, n));
    }
}
