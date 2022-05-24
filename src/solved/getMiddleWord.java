package solved;

class Solution76 {
    public String solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 1) {
                return String.valueOf(s.charAt(s.length() / 2));
            } else {
                return s.charAt((s.length() / 2) - 1) + String.valueOf(s.charAt(s.length() / 2));
            }
        }
        return s;
    }
}