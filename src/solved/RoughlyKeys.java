package solved;

import java.util.HashMap;

class RoughlyKeys {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int index = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                if(hashMap.getOrDefault(String.valueOf(keymap[i].charAt(j)), 0)==0) hashMap.put(String.valueOf(keymap[i].charAt(j)), j+1);
                else if(hashMap.getOrDefault(String.valueOf(keymap[i].charAt(j)), 0)>j) hashMap.put(String.valueOf(keymap[i].charAt(j)), j+1);
            }
        }

        for(String target : targets){
            int value = 0;
            for(int i=0; i<target.length(); i++){
                if(hashMap.getOrDefault(String.valueOf(target.charAt(i)), 0)==0) {
                    value = -1;
                    break;
                }else value+=hashMap.get(String.valueOf(target.charAt(i)));
            }
            answer[index] = value;
            index++;
        }

        
        return answer;
    }

    public static void main(String[] args) {
        RoughlyKeys r = new RoughlyKeys();

        System.out.println(r.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}));
    }
}