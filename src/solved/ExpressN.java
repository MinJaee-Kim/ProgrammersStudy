package solved;

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
            for (int k=i; k>0; k--) {
                for (Integer l : hashSetList[k-1]) {
                    for (Integer j : hashSetList[i - k]) {
                        hashSetList[i].add(j + l);
                        hashSetList[i].add(j * l);
                        hashSetList[i].add(j - l);
                        if (l!=0) {
                            hashSetList[i].add(j / l);
                        }
                        if (l==N) {
                            hashSetList[i].add(Integer.valueOf(j + String.valueOf(l)));
                        }
                    }
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();

        System.out.println(solution32.solution(8, 5800));
    }
}