package unsolved;

import java.util.HashSet;

public class SoulWareTest2 {
    public int solution(int[][] array) {
        HashSet<Integer> hashSet = new HashSet();
        int answer = 0;

        for (int i=0; i< array.length; i++){
            for (int j=0; j< array[i].length; j++){
                hashSet.add(array[i][j]);
            }
        }

        for (Integer i : hashSet){
            answer+=i;
        }

        return answer;
    }

    public static void main(String[] args) {
        SoulWareTest2 soulWareTest2 = new SoulWareTest2();
        int[][] array = {
                        {9, 11, 16, 21, 28, 36, 5}
                        ,{3, 9, 10, 29, 40, 45, 7}
                        ,{2, 5, 12, 14, 24, 39, 33}
                        ,{1, 6, 13, 37, 38, 40, 9}
                        ,{1, 21, 25, 29, 34, 37, 36}
                        };

        System.out.println(soulWareTest2.solution(array));
    }
}
