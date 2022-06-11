package solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

class Solution96 {
    HashSet<ArrayList<String>> hashSet = new HashSet<>();
    public int solution(String[] user_id, String[] banned_id) {
        boolean[] visited = new boolean[user_id.length];
        dfs(user_id, banned_id, visited, 0, new ArrayList<>());

        System.out.println(hashSet);

        return hashSet.size();
    }

    private void dfs(String[] user_id, String[] banned_id, boolean[] visited, int depth, ArrayList<String> arrayList) {
        if (arrayList.size() == banned_id.length) {
            Collections.sort(arrayList);
            hashSet.add((ArrayList<String>) arrayList.clone());
        }
        if (depth==banned_id.length)
            return;

        for (int i=0; i< user_id.length; i++){
            if (!visited[i]){
                visited[i] = true;
                if (Pattern.matches(banned_id[depth].replace('*', '.'), user_id[i])) {
                    arrayList.add(user_id[i]);
                    dfs(user_id, banned_id, visited, depth + 1, arrayList);
                    arrayList.remove(user_id[i]);
                }
                visited[i]=false;
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