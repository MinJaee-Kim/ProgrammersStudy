package solved;

import java.util.LinkedList;
import java.util.Queue;

class Solution104 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        for (int i=0; i<cities.length; i++){
            if (queue.contains(cities[i].toLowerCase())){
                queue.remove(cities[i].toLowerCase());
                queue.add(cities[i].toLowerCase());
                answer++;
            } else {
                queue.add(cities[i].toLowerCase());
                answer+=5;
            }

            if (queue.size()>cacheSize){
                queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution104 solution104 = new Solution104();
        String[] cities = {"1", "2", "3", "4", "2"};

        System.out.println(solution104.solution(4, cities));
    }
}