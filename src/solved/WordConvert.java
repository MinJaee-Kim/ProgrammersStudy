package solved;


class Solution60 {
    int min = 9999999;
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];

        dfs(words, visited, begin, target,  0);
        if (min==9999999){
            return 0;
        }

        return min;
    }

    private void dfs(String[] words, boolean[] visited, String word, String target, int value) {
        int check = 0;

        if (word.equals(target)) {
            min = Math.min(min, value);
            return;
        }

        for (int i=0; i< words.length; i++) {
            if (!visited[i]) {
                for (int j=0; j< words[i].length(); j++){
                    if (words[i].charAt(j)==word.charAt(j)){
                        check++;
                    }
                }
                if (check == word.length() - 1) {
                    visited[i] = true;
                    dfs(words, visited, words[i], target, value+1);
                    visited[i] = false;
                }
                check = 0;
            }
        }

        return;
    }

    public static void main(String[] args) {
        Solution60 solution60 = new Solution60();
        String[] words = {"hit", "hot", "lot"};

        System.out.println(solution60.solution("hit", "hot", words));
    }
}