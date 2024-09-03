package unsolved;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

class Solution47 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Integer[] convertPeople = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(convertPeople, Collections.reverseOrder());
        
        while(people.length>index||deque.size()!=0){
            if(people.length>index) deque.add(convertPeople[index]);
            
            index++;
            if(deque.size()>=2&&limit>=deque.peekFirst()+deque.peekLast()){
                deque.poll();
                deque.pop();
                answer++;
            }else if(index>people.length){
                deque.poll();
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[] people = {40, 50, 60, 90};
        int limit = 100;

        System.out.println(solution47.solution(people, limit));
    }
}