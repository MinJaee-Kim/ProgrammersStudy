package solved;

import java.util.*;

class Solution5 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] tryArray = new int[N+1];
        int[] failArray = new int[N];
        int k=0;

        HashMap<Integer, Double> rate = new HashMap<>();

        for (int i=0; i<stages.length; i++){
            for (int j=0; j<stages[i]; j++){
                tryArray[j]+=1;
            }
            if(stages[i]<=N)
                failArray[stages[i]-1]+=1;
        }

        for (int i=0; i< failArray.length; i++){
            if(tryArray[i]==0){
                rate.put(i+1, (double) 0);
            } else {
                rate.put(i+1, (double) failArray[i]/(double) tryArray[i]);
            }
        }

        List<Integer> keySetList = new ArrayList<>(rate.keySet());

        Collections.sort(keySetList, (o1, o2) -> (rate.get(o2).compareTo(rate.get(o1))));

        for (Integer key : keySetList){
            System.out.println(key+ "/" +rate.get(key));
            answer[k] = key;
            k++;
        }

        return answer;
    }
}