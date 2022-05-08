package solved;

class Solution68 {
    public int solution(int num) {
        int answer = 0;

        answer = collatz(num, 0);

        return answer;
    }

    private int collatz(long num, int count) {
        if (num==1){
            return count;
        } else if (count>500) {
            return -1;
        }

        if (num%2==0){
            return collatz(num/2, count+1);
        } else {
            return collatz(num*3+1, count+1);
        }
    }

    public static void main(String[] args) {
        Solution68 solution68 = new Solution68();

        System.out.println(solution68.solution(626331));
    }
}