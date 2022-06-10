package unsolved;

import java.util.ArrayList;
import java.util.Arrays;

class Solution60 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];

//        answer = dfs(words, visited, begin, target);

        return answer;
    }

    private int dfs(String[] words, boolean[] visited, String word, String target, int depth) {
        int check = 0;
        int value = 1;
        if (word.equals(target)){
            return value;
        }

        for (int i=0; i< words[depth].length(); i++){
            if (words[depth].charAt(i)==word.charAt(i)){
                check++;
            }
        }

        visited[depth] = true;

        if (check==word.length()-1){
//            value+=dfs()
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution60 solution60 = new Solution60();
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution60.solution("hit", "cog", words));
    }
}