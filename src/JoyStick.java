//덜 품
class Solution29 {
    public int solution(String name) {
        int answer = -2;
        String[] alpha = {"A","B","C","D","E","F",
                "G","H","I","J","K","L","M","N","O","P","Q",
                "R","S","T","U","V","W","X","Y","Z"};

        for (int i=0; i<name.length(); i++){
            for (int j=0; j<alpha.length; j++){
                if (name.substring(i, i+1).equals(alpha[j])){
                    if (j>13){
                        j=26-j;
                    }

                    answer+=j;
                    answer++;

                    System.out.println(answer);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        String name = "JAN";

        System.out.println(solution29.solution(name));
    }
}