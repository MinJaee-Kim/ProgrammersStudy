package solved;

class Solution115 {
    public int solution(int n) {
        String num = Integer.toBinaryString(n);
        int count = 0;
        int count2 = 0;

        for (int i=0; i<Integer.toBinaryString(n).length(); i++){
            if (num.charAt(i)=='1'){
                count++;
            }
        }

        while (true) {
            String num2 = Integer.toBinaryString(++n);
            for (int i = 0; i < num2.length(); i++) {
                if (num2.charAt(i)=='1'){
                    count2++;
                }
            }
            if (count==count2) {
                break;
            } else {
                count2 = 0;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Solution115 solution115 = new Solution115();

        System.out.println(solution115.solution(78));
    }
}