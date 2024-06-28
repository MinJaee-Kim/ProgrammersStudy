package solved;

import java.util.HashMap;

class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int[] answer = new int[photo.length];

        for(int i=0; i<name.length; i++){
            hashMap.put(name[i], yearning[i]);
        }

        for(int i=0; i<photo.length; i++){
            int score = 0;
            for(int j=0; j<photo[i].length; j++){
                if(hashMap.containsKey(photo[i][j])) score += hashMap.get(photo[i][j]);
            }
            answer[i] = score;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        MemoryScore m = new MemoryScore();
        String[] name = {"may", "kein", "kain", "radi"};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] yearning = {5, 10, 1, 3};

        System.out.println(m.solution(name, yearning, photo));
    }
}