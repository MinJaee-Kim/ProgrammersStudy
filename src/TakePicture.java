import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution33 {
    ArrayList<String> arrayList = new ArrayList();
    public int solution(int n, String[] data) {
        int answer = 0;
        String[] character = {"A", "C", "F", "J", "M", "N", "R", "T"};
        String[] output = new String[character.length];
        boolean[] visited = new boolean[character.length];

        perm(character, output, visited, 0, character.length, 8);

        for (int i=0; i< data.length; i++) {
            ArrayList<String> answerList = new ArrayList();
            for (int j = 0; j < arrayList.size(); j++) {
                String time="";
                if (data[i].charAt(3) == '=') {
                    for (int k = 0; k < Integer.parseInt(data[i].substring(4)); k++) {
                        time += ".";
                    }
                } else if (data[i].charAt(3) == '>') {
                    for (int k = 0; k < Integer.parseInt(data[i].substring(4)) + 1; k++) {
                        time += ".";
                        if (k == Integer.parseInt(data[i].substring(4)) - 1) {
                            time += "+";
                        }
                    }
                } else if (data[i].charAt(3) == '<') {
                    time="[A-Z]"+"{0,"+(Integer.parseInt(String.valueOf(data[i].charAt(4)))-1)+"}";
                    Pattern pattern = Pattern.compile(data[i].substring(0, 1)+time+data[i].substring(2, 3));
                    Pattern pattern2 = Pattern.compile(data[i].substring(2, 3)+time+data[i].substring(0, 1));
                    Matcher matcher = pattern.matcher(arrayList.get(j));
                    Matcher matcher2 = pattern2.matcher(arrayList.get(j));
                    if (matcher.find() || matcher2.find()) {
                        answerList.add(arrayList.get(j));
                    }
                    continue;
                }
                Pattern pattern = Pattern.compile(data[i].substring(0, 1)+time+data[i].substring(2, 3));
                Pattern pattern2 = Pattern.compile(data[i].substring(2, 3)+time+data[i].substring(0, 1));
                Matcher matcher = pattern.matcher(arrayList.get(j));
                Matcher matcher2 = pattern2.matcher(arrayList.get(j));
                if (matcher.find() || matcher2.find()) {
                    answerList.add(arrayList.get(j));
                }
            }

            arrayList = answerList;
            System.out.println(answerList);
            answer = answerList.size();
        }
        return answer;
    }

    private void perm(String[] character, String[] output, boolean[] visited, int depth, int n, int r) {
        String answer = "";
        if (depth == r) {
            for (int i=0; i<output.length; i++) {
                answer+=output[i];
            }
            arrayList.add(answer);
            return;
        }


        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = character[i];
                perm(character, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
}

public class TakePicture {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        String[] data = {"N~F=2", "R~T<2"};
        int n = 2;

        System.out.println(solution33.solution(2, data));
    }
}