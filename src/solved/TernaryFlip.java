package solved;

class Solution71 {
    public int solution(int n) {
        int answer = 0;
        int value = 0;
        String ternary = "";
        while (n>0){
            ternary = ternary+(n%3);
            n/=3;
        }
        for (int i=ternary.length()-1; i>=0; i--){
            value = Integer.parseInt(String.valueOf(ternary.charAt(i)));
            answer += value*Math.pow(3, (ternary.length()-1)-i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution71 solution71 = new Solution71();

        System.out.println(solution71.solution(125));
    }
}