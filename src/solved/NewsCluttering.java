package solved;

import java.util.HashMap;

class Solution58 {
    public int solution(String str1, String str2) {
        int answer = 65536;
        int plus = 0;
        int union = 0;
        String value = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for (int i=0; i<str1.length()-1; i++){
            if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90 &&
                    str1.charAt(i+1) >= 65 && str1.charAt(i+1) <= 90){
                value = str1.charAt(i)+String.valueOf(str1.charAt(i+1));
                hashMap.put(value, hashMap.getOrDefault(value, 0)+1);
            }
        }

        for (int i=0; i<str2.length()-1; i++){
            if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90 &&
                    str2.charAt(i+1) >= 65 && str2.charAt(i+1) <= 90){
                value = str2.charAt(i)+String.valueOf(str2.charAt(i+1));
                hashMap2.put(value, hashMap2.getOrDefault(value, 0)+1);
            }
        }

        for (String s : hashMap.keySet()) {
            if (hashMap2.containsKey(s)){
                plus+=Math.min(hashMap.get(s), hashMap2.get(s));
                union+=Math.max(hashMap.get(s), hashMap2.get(s));
            }
        }

        for (String s : hashMap.keySet()) {
            if (!hashMap2.containsKey(s)){
                union+=hashMap.get(s);
            }
        }

        for (String s : hashMap2.keySet()) {
            if (!hashMap.containsKey(s)){
                union+=hashMap2.get(s);
            }
        }

        if (!(union==0)) {
            answer = (int) (Double.parseDouble(String.valueOf(answer)) * (Double.parseDouble(String.valueOf(plus)) / Double.parseDouble(String.valueOf(union))));
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution58 solution58 = new Solution58();

        System.out.println(solution58.solution("E=M*C^2", "E=M*C^2"));
    }
}