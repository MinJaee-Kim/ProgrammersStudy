package unsolved;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

class Solution47 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        int stackIndex = 0;
        int removeCount = 0;
        Stack<Integer> stack = new Stack<>();
        Integer[] convertPeople = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(convertPeople, Collections.reverseOrder());
        
        while(people.length>index||people.length>removeCount){
            if(people.length>index) stack.push(convertPeople[index]);
            
            index++;
            if(stackIndex<stack.size()&&stack.get(stackIndex)+stack.get(stack.size()-1)<=limit){
                stack.pop();
                stackIndex++;
                removeCount++;
                removeCount++;
                answer++;
            }else if(index>people.length){
                removeCount++;
                stackIndex++;
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(solution47.solution(people, limit));
    }
}