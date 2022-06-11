package unsolved;

import java.util.ArrayList;

class Solution50 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int skillIndex = 0;
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i=0; i<skill_trees.length; i++){
            for (int j=0; j<skill_trees[i].length(); j++){
                if (skill_trees[i].charAt(j)==skill.charAt(skillIndex)) {
                    arrayList.add(j);
                    skillIndex++;
                    j=-1;
                }
                if (skillIndex>=skill.length()){
                    break;
                }
            }
            int val = 0;
            if (!arrayList.isEmpty()) {
                val = arrayList.get(0);
            }

            if (arrayList.size()<=1){
                answer++;
            }
            for (int j=1; j<arrayList.size(); j++){
                if (arrayList.get(j)>val){
                    val = arrayList.get(j);
                    if (j==arrayList.size()-1){
                        answer++;
                    }
                } else {
                    break;
                }
            }
            arrayList.clear();
            skillIndex=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        String skill = "CBD";
        String[] skill_trees = {"C", "D", "CB", "BDA"};

        System.out.println(solution50.solution(skill, skill_trees));
    }
}