package unsolved;

import java.util.ArrayList;

class Solution109 {
    ArrayList<Integer> answer;
    long k=0;
    long c=0;
    public ArrayList<Integer> solution(int n, long k) {

        int[] line = new int[n];
        for (int i=1; i<= line.length; i++){
            line[i-1] = i;
        }
        this.k = k;
        boolean[] visited = new boolean[n];
        dfs(line, visited, new ArrayList<Integer>());

        return answer;
    }

    private void dfs(int[] line, boolean[] visited, ArrayList<Integer> answer) {
        if (this.k-1 == c&&answer.size()>=line.length){
            c++;
            this.answer = (ArrayList<Integer>) answer.clone();
        } else if (answer.size()>=line.length){
            c++;
        }

        for (int i=0; i< line.length; i++) {
            if (!visited[i]){
                visited[i] = true;
                answer.add(line[i]);
                dfs(line, visited, answer);
                answer.remove(answer.size()-1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution109 solution109 = new Solution109();

        System.out.println(solution109.solution(3, 5));
    }
}