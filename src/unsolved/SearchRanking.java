package unsolved;

class Solution43 {
    public int[] solution(String[] info, String[] query) {
        int[] answer = {};


        System.out.println(info[1].substring(info[1].indexOf(" ")+1, info[1].indexOf(" ", 7)));

        for (int i=0; i< info.length; i++){
            for (int j=0; j< query.length; j++){

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] info = {"java backend junior pizza 150",
                         "python frontend senior chicken 210",
                         "python frontend senior chicken 150",
                         "cpp backend senior pizza 260",
                         "java backend junior chicken 80",
                         "python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100",
                          "python and frontend and senior and chicken 200",
                          "cpp and - and senior and pizza 250",
                          "- and backend and senior and - 150",
                          "- and - and - and chicken 100",
                          "- and - and - and - 150"};
        Solution43 solution43 = new Solution43();
        System.out.println(solution43.solution(info, query));
    }
}