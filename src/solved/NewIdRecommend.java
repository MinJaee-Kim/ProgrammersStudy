package solved;

import java.util.Arrays;
import java.util.LinkedList;

class Solution3 {
    public String solution(String new_id) {
        String answer = "";
        String RecommendId = "";
        StringBuilder sb = new StringBuilder("");
        LinkedList<Character> spArray = new LinkedList<Character>(Arrays.asList('~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '=',
                '+', '[', '{', ']', '}', ':', '?', ',', '<', '>', '/'));
        LinkedList<Character> idArray = new LinkedList<Character>();

        RecommendId = new_id.toLowerCase();

        for (int i=0; i< RecommendId.length(); i++){
            idArray.add(RecommendId.charAt(i));
        }

        for (int i=0; i< idArray.size(); i++) {
            if (spArray.contains(idArray.get(i))){
                idArray.remove(i);
                --i;
            }
        }

        for (int i=0; i< idArray.size()-1; i++) {
            if (idArray.get(i) == '.' && idArray.get(i+1) == '.'){
                idArray.remove(i);
                --i;
            }
        }

        if(idArray.getFirst() == '.'){
            idArray.removeFirst();
        }

        for (int i=0; i< idArray.size(); i++) {
            if (idArray.get(i)==' '){
                idArray.remove(i);
            }
        }


        while (idArray.size() > 15) idArray.removeLast();

        while (idArray.size() < 1) idArray.add('a');

        if (idArray.getLast() == '.') {
            idArray.removeLast();
        }

        while (idArray.size() < 3) idArray.add(idArray.getLast());


        for (int i=0; i< idArray.size(); i++){
            sb.append(idArray.get(i));
        }

        answer = sb.toString();

        return answer;
    }

}
