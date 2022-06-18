package solved;

class Solution50 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int index = 0;
        boolean isTrue = true;

        for (int i=0; i< skill_trees.length; i++){
            for (int j=0; j< skill_trees[i].length(); j++) {
                if (index>=skill.length()){
                    break;
                }
                if (skill_trees[i].charAt(j)==skill.charAt(index)){
                    index++;
                } else if (skill.contains(String.valueOf(skill_trees[i].charAt(j)))) {
                    isTrue = false;
                    break;
                }
            }
            index = 0;
            if (isTrue) {
                answer++;
            }
            isTrue = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        String skill = "CBD";
//        String[] skill_trees = {"C", "D", "CB", "BDA"};
//        String[] skill_trees2 = {"AEF", "ZJW"};
        String[] skill_trees3 = {"BACDE", "CBADF", "AECB", "BDA"};

//        System.out.println(solution50.solution(skill, skill_trees));
//        System.out.println(solution50.solution(skill, skill_trees2));
        System.out.println(solution50.solution(skill, skill_trees3));
    }
}