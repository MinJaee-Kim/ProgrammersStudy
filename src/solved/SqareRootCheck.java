package solved;

class Solution128 {
    public long solution(long n) {
        if (Math.sqrt(n)==Math.ceil(Math.sqrt(n))){
            return (long) Math.pow(Math.sqrt(n)+1, 2);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution128 solution128 = new Solution128();

        System.out.println(solution128.solution(121));
    }
}