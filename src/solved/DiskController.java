package solved;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution90 {
    public int solution(int[][] jobs) {
        int round;
        PriorityQueue<Result> priorityQueue = new PriorityQueue<>();

        Arrays.sort(jobs, ((o1, o2) -> {
            if (o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        }));

        int position = jobs[0][0];
        position += jobs[0][1];
        round = jobs[0][1];

        for (int i=0; i< jobs.length; i++){
            for (int j=i+1; j< jobs.length; j++){
                if (position>=jobs[j][0]){
                    priorityQueue.add(new Result(jobs[j][1], jobs[j][0]));
                    i=j;
                } else if (priorityQueue.isEmpty()){
                    position = jobs[j][0];
                    j--;
                } else {
                    break;
                }
            }

            while (!priorityQueue.isEmpty()){
                position+=priorityQueue.peek().now;
                priorityQueue.peek().result = position-priorityQueue.peek().value;
                round += priorityQueue.peek().result;
                priorityQueue.poll();

                if (i<=jobs.length-2) {
                    for (int j=i+1; j< jobs.length; j++){
                        if (position>jobs[j][0]){
                            priorityQueue.add(new Result(jobs[j][1], jobs[j][0]));
                            i=j;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        return round / jobs.length;
    }

    class Result implements Comparable<Result>{
        int now;
        int value;
        int result;

        Result(int now, int value){
            this.now = now;
            this.value = value;
        }

        @Override
        public int compareTo(Result o) {
            return this.now - o.now;
        }
    }

    public static void main(String[] args) {
        Solution90 solution90 = new Solution90();
        int[][] jobs = {{0, 10}, {4, 10}, {15, 2}, {5, 11}};

//        System.out.println(solution90.solution(jobs));
//        System.out.println(solution90.solution(new int[][]{{24, 10}, {18, 39}, {34, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}}));
//        System.out.println(solution90.solution(new int[][]{{0, 5}, {2, 10}, {10000, 2}}));
//        System.out.println(solution90.solution(new int[][]{{0,1},{0,2},{2,1}}));
//        System.out.println(solution90.solution(new int[][]{{0,3},{4,4},{5,3},{4,1}}));
    }
}