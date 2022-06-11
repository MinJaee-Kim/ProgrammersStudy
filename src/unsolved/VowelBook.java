package unsolved;

class Solution101 {
    public int solution(String word) {
        int answer = 0;
        String compare = "";

        while (word.equals(compare)){
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution101 solution101 = new Solution101();

        System.out.println(solution101.solution("AAAAE"));
    }
}