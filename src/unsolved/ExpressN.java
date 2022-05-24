package unsolved;

import java.util.HashSet;

class Solution32 {
    public int solution(int N, int number) {
        int answer = 0;
        HashSet<Integer>[] hashSetList = new HashSet[9];

        for (int i=0; i<9; i++) {
            hashSetList[i] = new HashSet<>();
        }
        hashSetList[0].add(N);

        for (int i=1; i<9; i++){
            if (hashSetList[i-1].contains(number)){
                answer = i;
                break;
            } else {
                answer = -1;
            }
            for (Integer j : hashSetList[i-1]){
                hashSetList[i].add(j+N);
                hashSetList[i].add(j*N);
                hashSetList[i].add(j-N);
                hashSetList[i].add(j/N);
                if (Long.parseLong(j+String.valueOf(N))<2147483647) {
                    hashSetList[i].add(Integer.valueOf(j+String.valueOf(N)));
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();

        System.out.println(solution32.solution(5, 12));
    }
}