package unsolved;

import java.util.HashMap;

class PersonalityServey {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<survey.length; i++){
            if(choices[i]>4) {
                hashMap.put(String.valueOf(survey[i].charAt(1)), hashMap.getOrDefault(String.valueOf(survey[i].charAt(1)), 0)+Math.abs(4-choices[i]));
            } else if(choices[i]==4) {}
            else {
                hashMap.put(String.valueOf(survey[i].charAt(0)), hashMap.getOrDefault(String.valueOf(survey[i].charAt(0)), 0)+Math.abs(4-choices[i]));
            }
        }

        if(hashMap.getOrDefault("R", 0)>=hashMap.getOrDefault("T", 0)) answer+="R";
        else answer+="T";
        if(hashMap.getOrDefault("C", 0)>=hashMap.getOrDefault("F", 0)) answer+="C";
        else answer+="F";
        if(hashMap.getOrDefault("J", 0)>=hashMap.getOrDefault("M", 0)) answer+="J";
        else answer+="M";
        if(hashMap.getOrDefault("A", 0)>=hashMap.getOrDefault("N", 0)) answer+="A";
        else answer+="N";

        return answer;
    }

    public static void main(String[] args) {
        PersonalityServey p = new PersonalityServey();
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};

        System.out.println(p.solution(survey, choices));
    }
}