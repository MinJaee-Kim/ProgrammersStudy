package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class DFSandBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        DFSandBFS dfSandBFS = new DFSandBFS();

        String[] inputString = input.split(" ");
        ArrayList arrayList = new ArrayList();

        int first = Integer.parseInt(inputString[0]);
        int second = Integer.parseInt(inputString[1]);
        int third = Integer.parseInt(inputString[2]);
        boolean[] visited = new boolean[first-1];

        for(int i = 0; i < second; i++){
            String line = sc.nextLine();
            arrayList.add(line);
        }

//        dfSandBFS.dfs(arrayList, visited, third);
    }

    private void dfs(ArrayList<Integer> arrayList, boolean[] visited, int start, int end){
        if(visited[end]) return;

        if(visited[start]){

        }

        visited[end] = true;
        arrayList.add(end);
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) == end){
//                dfs(arrayList, visited, start);
            }
        }
    }

    private void bfs(ArrayList<Integer> arrayList, boolean[] visited, int start){
        if(visited[start]) return;

        visited[start] = true;
        arrayList.add(start);
        for(int i = 0; i < arrayList.size(); i++){

        }
        bfs(arrayList, visited, start+1);
    }
}
