package unsolved;

class ThreeMans {
    int answer = 0;
    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];
        
        dfs(number, visited, 0, 0, 3);

        return answer;
    }

    private void dfs(int[] number, boolean[] visited, int depth, int now, int r){
        if(r == 0) {
            if(now==0) answer++;
            return;
        }
        if(depth == number.length) {
            return;
        } else {
            // visited[depth] = true;
            dfs(number, visited, depth + 1, now+number[depth], r-1);

            // visited[depth] = false;
            dfs(number, visited, depth + 1, now, r);
        }
        

        return;
    }

    public static void main(String[] args) {
        ThreeMans t = new ThreeMans();
        int[] number = {-2, 3, 0, 2, -5};

        System.out.println(t.solution(number));
    }
}