package unsolved;

import java.util.ArrayList;

class AEIOU {
    int answer = 0;
    public int solution(String word) {
        String[] words = {"A", "E", "I", "O", "U"};

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        dfs(arrayList, words, 0, stringBuilder, word, false);
        return answer;
    }

    private void dfs(ArrayList<String> answers, String[] words, int depth, StringBuilder now, String target, boolean isDelete){
        if(target.equals(now.toString())) {
            answer = answers.size();
            return;
        } else {
            if(now.toString().endsWith("U")){
                now.deleteCharAt(now.length()-1);
                isDelete = true;
            }else if(now.toString().endsWith("O")){
                now.deleteCharAt(now.length()-1);
                now.append("U");
            }else if(now.toString().endsWith("I")){
                now.deleteCharAt(now.length()-1);
                now.append("O");
            }else if(now.toString().endsWith("E")){
                now.deleteCharAt(now.length()-1);
                now.append("I");
            }else if(now.toString().endsWith("A")&&!isDelete){
                if(now.toString().length()>4) {
                    now.deleteCharAt(now.length()-1);
                    now.append("E");
                } else now.append("A");
            }else if(now.toString().endsWith("A")&&isDelete){
                now.deleteCharAt(now.length()-1);
                now.append("E");
                isDelete = false;
            }

            answers.add(now.toString());
            dfs(answers, words, depth+1, now, target, isDelete);
        }

        return;
    }

    public static void main(String[] args) {
        AEIOU a = new AEIOU();

        System.out.println(a.solution("I"));
    }
}