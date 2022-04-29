class Solution20 {
    public int solution(String s) {
        int answer = s.length();
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=1; i<=s.length()/2; i++){
            stringBuilder.delete(0, stringBuilder.length());
            for (int j=0; ; j+=i){
                String comp = s.substring(j, j+i);
                if (j+i+i>s.length()){
                    if (count>1){
                        stringBuilder.append(count);
                        stringBuilder.append(comp);
                    } else {
                        stringBuilder.append(comp);
                    }
                    count = 1;

                    stringBuilder.append(s.substring(j+i));

                    break;
                }
                if (s.substring(j+i, j+i+i).equals(comp)){
                    count++;
                } else {
                    if (count>1){
                        stringBuilder.append(count);
                        stringBuilder.append(comp);
                    } else {
                        stringBuilder.append(comp);
                    }
                    count = 1;
                }
            }
            if (stringBuilder.length() > 1) {
                if (answer > stringBuilder.length()) {
                    answer = stringBuilder.length();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();

        System.out.println(solution20.solution("abcabcdede"));
    }
}