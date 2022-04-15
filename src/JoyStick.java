class Solution29 {
    public int solution(String name) {
        int answer = 0;
        String[] alpha = {"A","B","C","D","E","F",
                "G","H","I","J","K","L","M","N","O","P","Q",
                "R","S","T","U","V","W","X","Y","Z"};

        for (int i=0; i<name.length(); i++){

            for (int j=0; j<alpha.length; j++){
                if (name.substring(i, i+1).equals(alpha[j])){
                    if (j>=13){
                        j=26-j;
                    }
                    answer+=j;
                    break;
                }
            }
            if (name.charAt(i) == 'A') {
            }
            System.out.println(answer);
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        String name = "JAZ";

        System.out.println(solution29.solution(name));
    }
}