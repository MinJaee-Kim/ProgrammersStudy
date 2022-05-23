package unsolved;

import java.util.ArrayList;
import java.util.Arrays;

class Solution60 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> words2 = new ArrayList<>();

        words2.addAll(Arrays.asList(words));

        if (words2.contains(target)) {
            answer = dfs(words, visited, begin, target);
        }

        return answer;
    }

    private int dfs(String[] words, ArrayList<String> visited, String word, String target) {
        int value = 1;
        int isUse = 0;

        if (visited.contains(word)){
            return 0;
        }
        for (int i=0; i< target.length(); i++){
            if (target.charAt(i)!=word.charAt(i)){
                isUse++;
            }
        }
        if (isUse==0){
            return value;
        }
        isUse = 0;

        visited.add(word);

        for (int i=0; i< words.length; i++){
            for (int j=0; j< words[i].length(); j++){
                if (word.charAt(j)!=words[i].charAt(j)){
                    isUse++;
                }
            }

            if (isUse==1){
                value+=dfs(words, visited, words[i], target);
                break;
            }
            isUse = 0;

        }

        return value;
    }

    public static void main(String[] args) {
        Solution60 solution60 = new Solution60();
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution60.solution("hit", "cog", words));
    }
}