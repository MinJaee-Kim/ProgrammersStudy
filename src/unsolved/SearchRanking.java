package unsolved;

import java.util.Arrays;
import java.util.StringTokenizer;

class Solution43 {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        People[] people = new People[info.length];
        int index = 0;

        for (String s : info){
            StringTokenizer stringTokenizer = new StringTokenizer(s, " ");

            people[index++] = new People(
                    stringTokenizer.nextToken(), stringTokenizer.nextToken(), stringTokenizer.nextToken(),
                    stringTokenizer.nextToken(), Integer.parseInt(stringTokenizer.nextToken())
                    );
        }

        Arrays.sort(people);

        for (int i=0; i< query.length; i++){
            String[] sp = query[i].split(" and ");

            for (int j=0; j<people.length; j++){
                if (
                        (sp[0].equals(people[j].word)||sp[0].equals("-")) &&
                        (sp[1].equals(people[j].end)||sp[1].equals("-")) &&
                        (sp[2].equals(people[j].career)||sp[2].equals("-")) &&
                        (sp[3].substring(0, sp[3].indexOf(" ")).equals(people[j].food)||sp[3].substring(0, sp[3].indexOf(" ")).equals("-"))
                ){
                    if (Integer.parseInt(sp[3].substring(sp[3].indexOf(" ")+1))<=(people[j].score)||sp[3].substring(sp[3].indexOf(" ")+1).equals("-")){
                        answer[i]++;
                    } else {
                        break;
                    }
                }
            }
        }

        return answer;
    }

    class People implements Comparable<People> {
        String word;
        String end;
        String career;
        String food;
        int score;

        @Override
        public int compareTo(People o) {
            return o.score - this.score;
        }

        People(String word, String end, String career, String food, int score) {
            this.word = word;
            this.end = end;
            this.career = career;
            this.food = food;
            this.score = score;
        }
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