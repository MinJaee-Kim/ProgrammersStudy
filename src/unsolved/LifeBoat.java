package unsolved;

import java.util.ArrayList;
import java.util.Arrays;

class Solution47 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int person = 0;
        int count = 0;

        ArrayList<Integer> arrayList = new ArrayList();
        Arrays.sort(people);

        for (int i=people.length-1; i>=0; i--){
            arrayList.add(people[i]);
        }

        System.out.println(arrayList);


        for (int i=0; ; i++){
            if (arrayList.isEmpty()) {
                break;
            }

            if (person + arrayList.get(i) <= limit) {
                person += arrayList.get(i);
                arrayList.remove(i);
                i--;
                count++;
            }

            if (i==arrayList.size()-1 || count>=2){
                answer++;
                person = 0;
                count=0;
                i=-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[] people = {40, 40, 80};
        int limit = 160;

        System.out.println(solution47.solution(people, limit));
    }
}