package unsolved;

import java.util.ArrayList;
import java.util.Comparator;

class Solution106 {
    ArrayList<ArrayList<String>> answer2 = new ArrayList();
    public ArrayList<String> solution(String[][] tickets) {
        ArrayList<String> answer = new ArrayList();
        boolean[] visited = new boolean[tickets.length];

        answer.add("ICN");

        dfs(tickets, visited, "ICN", answer, 0);

        answer2.sort(new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                int res = 0;
                if (!o1.get(1).equals(o2.get(1))) {
                    res = o1.get(1).compareTo(o2.get(1));
                } else {
                    res = o1.get(2).compareTo(o2.get(2));
                }

                return res;
            }
        });

        System.out.println(answer2);

        return answer2.get(0);
    }

    private void dfs(String[][] tickets, boolean[] visited, String now, ArrayList<String> answer, int count) {
        if (tickets.length==count) {
            answer2.add((ArrayList<String>) answer.clone());
            return;
        }


        for (int i=0; i< tickets.length; i++){
            if (now.equals(tickets[i][0])){
                if (!visited[i]) {
                    visited[i] = true;
                    answer.add(tickets[i][1]);
                    dfs(tickets, visited, tickets[i][1], answer, count+1);
                    visited[i] = false;
                    answer.remove(tickets[i][1]);
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Solution106 solution106 = new Solution106();
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[][] tickets2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        String[][] tickets3 = {{"ICN", "COO"}, {"ICN", "BOO"}, {"COO", "ICN"}, {"BOO", "DOO"}};
        String[][] tickets4 = {{"ICN", "A"}, {"ICN", "A"}, {"A", "ICN"}, {"A" , "C"}};
        String[][] tickets5 = {{"ICN", "A"}, {"ICN", "B"}, {"B", "ICN"}};

        System.out.println(solution106.solution(tickets2));
    }
}