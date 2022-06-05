package solved;

import java.util.Arrays;
import java.util.HashSet;

class Solution94 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i<numbers.length; i++){
            for (int j=i+1; j<numbers.length; j++){
                hashSet.add(numbers[i]+numbers[j]);
            }
        }

        int[] answer = new int[hashSet.size()];
        int index = 0;
        for(Integer i : hashSet){
            answer[index] = i;
            index++;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution94 solution94 = new Solution94();
        int[] numbers = {2,1,3,4,1};

        System.out.println(solution94.solution(numbers));
    }
}
