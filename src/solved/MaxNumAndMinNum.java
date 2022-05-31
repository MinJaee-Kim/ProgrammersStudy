package solved;

class Solution90 {
    public String solution(String s) {
        String answer = "";
        StringBuilder value = new StringBuilder();
        int max = -2147483647;
        int min = 2147483647;


        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='-'){
                for (int j=i+1;;j++){
                    value.append(s.charAt(j));
                    if (s.charAt(j) == ' ' || j>=s.length()-1){
                        i=j;
                        break;
                    }
                }
                max = Math.max(max, -Integer.parseInt(String.valueOf(value).trim()));
                min = Math.min(min, -Integer.parseInt(String.valueOf(value).trim()));
                value.delete(0, value.length());
            } else {
                for (int j=i;;j++){
                    value.append(s.charAt(j));
                    if (s.charAt(j) == ' ' || j>=s.length()-1){
                        i=j;
                        break;
                    }
                }
                max = Math.max(max, Integer.parseInt(String.valueOf(value).trim()));
                min = Math.min(min, Integer.parseInt(String.valueOf(value).trim()));
                value.delete(0, value.length());
            }
        }
        answer = min + " " + max;

        return answer;
    }

    public static void main(String[] args) {
        Solution90 solution90 = new Solution90();

        System.out.println(solution90.solution("1 2 3 4"));
    }
}