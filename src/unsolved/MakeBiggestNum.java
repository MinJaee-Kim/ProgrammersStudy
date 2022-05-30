package unsolved;

class Solution35 {
    public String solution(String number, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int max = 0;
        int index = 0;
        int count = 0;

        while (stringBuilder.length()<number.length()-k) {
            for (int j = index; j < count + number.length() - k; j++) {
                if (Character.getNumericValue(number.charAt(j)) > max){
                    max = Character.getNumericValue(number.charAt(j));
                    index = j;
                }
            }
            stringBuilder.append(number.charAt(index));
            index++;
            count = index;
            max = 0;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        String number = "1231234";

        System.out.println(solution35.solution(number, 3));
    }
}