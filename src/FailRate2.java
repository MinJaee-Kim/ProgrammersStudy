import java.util.*;

class Solution5 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] successArray = {};
        int[] failArray = {};
        HashMap<Double, Integer> rate = new HashMap<>();

        for (int i=0; i<stages.length; i++){
            for (int j=0; j<stages[i]; j++){
                successArray[i]+=1;
            }
            failArray[stages[i]]+=1;
        }
        for (int i=0; i<N; i++){
            rate.put((double) successArray[i] / (double) failArray[i], i);
        }

        List<Map.Entry<Integer, Double>> entryList = new ArrayList<Map.Entry<Integer, Double>>();

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });
        for (Map.Entry<Integer, Double> entry : entryList){
            answer[1] = entry.getKey();
        }


        return answer;
    }
}