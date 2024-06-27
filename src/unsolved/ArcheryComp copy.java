package unsolved;

import java.util.ArrayList;
import java.util.Collections;

class HallOfFalm {
    public int[] solution(int k, int[] score) {
        ArrayList<Object> stores = new ArrayList<>();
        ArrayList<Integer> store = new ArrayList<>();
        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++){
            if(store.size()<k) {
                store.add(score[i]);
                Collections.sort(store);
            } else {
                if(score[i]>store.get(0)){
                    store.remove(0);
                    store.add(score[i]);

                    Collections.sort(store);
                }
            }

            stores.add(store.clone());
        }

        for(int i=0; i<score.length; i++){
            int min = 99999999;
            for(int j=0; j<((ArrayList)stores.get(i)).size(); j++){
                int value = (int) ((ArrayList)stores.get(i)).get(j);

                min = min>value ? value:min;
            }
            answer[i] = min;
        }

        return answer;
    }

    public static void main(String[] args) {
        HallOfFalm h = new HallOfFalm();
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;


        System.out.println(h.solution(k, score));
    }
}