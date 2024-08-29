package solved;

import java.util.Stack;

public class MakeHamberger {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int ingred:ingredient){
            stack.add(ingred);
            if(stack.size()>=4&&stack.get(stack.size()-1)==1&&stack.get(stack.size()-2)==3&&stack.get(stack.size()-3)==2&&stack.get(stack.size()-4)==1){
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        MakeHamberger makeHamberger = new MakeHamberger();
        int[] ingredient = {1, 2, 3, 1};

        System.out.println(makeHamberger.solution(ingredient));
    }
}
