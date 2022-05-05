package solved;

class Solution28 {
    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (;n>0;) {
            if (n%3==0){
                stringBuilder.insert(0,4);
                n /= 3;
                n--;
                continue;
            }

            if (n%3==1){
                stringBuilder.insert(0,1);
            }

            if (n%3==2){
                stringBuilder.insert(0,2);
            }
            n /= 3;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int n = 10;

        System.out.println(solution28.solution(n));
    }
}