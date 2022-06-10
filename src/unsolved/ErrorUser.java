package unsolved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;

class Solution96 {
    int answer = 0;
    ArrayList<HashSet> arrayList = new ArrayList<>();
    public int solution(String[] user_id, String[] banned_id) {

        boolean[] visited = new boolean[user_id.length];
        dfs(user_id, banned_id, visited, 0, 0, new HashSet<>());

        return answer;
    }

    private void dfs(String[] user_id, String[] banned_id, boolean[] visited, int depth, int n, HashSet<String> hashSet) {
        HashSet<String> hashSet2 = (HashSet<String>) hashSet.clone();

        if (depth >= user_id.length) {
            return;
        } else if (hashSet2.size()>= banned_id.length){
            System.out.println("확인");
            arrayList.add(hashSet2);
            System.out.println(arrayList);
            return;
        } else if (n>= banned_id.length) {
            arrayList.add(hashSet2);
            System.out.println(arrayList);
            System.out.println("확인");
            return;
        }

        for (int i=0; i< user_id.length; i++){
            if (!visited[i]) {
                visited[i] = true;
                if (Pattern.matches(banned_id[n].replace("*", "."), user_id[i])) {
                    hashSet.add(user_id[i]);
                    hashSet2.add(user_id[i]);
                    dfs(user_id, banned_id, visited, depth + 1, n + 1, hashSet);
                }
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution96 solution96 = new Solution96();
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"fr*d*", "*rodo", "******", "******"};

        System.out.println(solution96.solution(user_id, banned_id));
    }
}