package unsolved;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class Solution47 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int count = 0;
        int first = 0;
        int second = 0;
        Integer[] sortPeople = new Integer[people.length];
        LinkedList linkedList = new LinkedList<>();
        for (int i=0; i< people.length; i++){
            sortPeople[i] = people[i];
        }
        Arrays.sort(sortPeople, Collections.reverseOrder());
        for (int i=0; i<sortPeople.length; i++){
            first = sortPeople[i];
            count = 0;
            if (linkedList.contains(i)) {
                continue;
            }
            for (int j=i+1; j<sortPeople.length; j++) {
                second = sortPeople[j];
                if (first + second <= limit && count == 0) {
                    linkedList.add(j);
                    count++;
                }
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[] people = {20, 50, 50, 80};
        int limit = 100;

        System.out.println(solution47.solution(people, limit));
    }
}