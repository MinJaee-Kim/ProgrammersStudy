package solved;

class Solution78 {
    public boolean solution(int x) {
        int value = 0;
        for (int i=0; i<String.valueOf(x).length(); i++){
            value += Character.getNumericValue(String.valueOf(x).charAt(i));
        }
        if (x%value==0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution78 solution78 = new Solution78();

        System.out.println(solution78.solution(10));
    }
}