class Solution26 {
    public int solution(int[] nums) {
        int answer = -1;

        System.out.println(isPrime(11));

        return answer;
    }

    public void comb(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {

        } else {

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