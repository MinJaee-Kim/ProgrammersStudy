class Solution29 {
    public int solution(String name) {
        int answer = 0;
        char[] alpha = {'A','B','C','D','E','F',
                'G','H','I','J','K','L','M','N','O','P','Q',
                'R','S','T','U','V','W','X','Y','Z'};

        int count;
        int length = name.length() - 1;

        for (int i=0; i<name.length(); i++){
            count = i + 1;

            while (count < name.length() && name.charAt(count) == 'A') {
                count++;
            }

            length = Math.min(length, i * 2 + name.length() - count);
            length = Math.min(length, (name.length() - count) * 2 + i);
            for (int j=0; j<alpha.length; j++){
                if (name.charAt(i)==alpha[j]){
                    if (j > 13){
                        answer+=26-j;
                    } else {
                        answer+=j;
                    }
                    break;
                }
            }
        }

        return answer+length;
    }

    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        String name = "BBBBAAAAB";

        System.out.println(solution29.solution(name));
    }
}