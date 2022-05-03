class Solution50 {
    public int solution(String skill, String[] skill_trees) {
        int answer = -1;
        int index = 0;

        for (int i=0; i<skill_trees.length; i++){
            for (int j=0; j<skill_trees[i].length(); j++){
                if (skill_trees[i].contains(String.valueOf(skill.charAt(i)))){
                    System.out.println("확인");
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution50.solution(skill, skill_trees));
    }
}