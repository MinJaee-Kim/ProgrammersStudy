package solved;

class Solution65 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] sarr1 = new String[n];
        String[] sarr2 = new String[n];
        int length = 0;
        StringBuilder sanswer;

        for (int i=0; i<arr1.length; i++){
            StringBuilder binary = new StringBuilder(Integer.toBinaryString(arr1[i]));
            if (binary.length()<n){
                length = binary.length();
                for (int j=0; j<n-length; j++){
                    binary.insert(0, "0");
                }
            }
            sarr1[i] = String.valueOf(binary);
        }

        for (int i=0; i<arr2.length; i++){
            StringBuilder binary = new StringBuilder(Integer.toBinaryString(arr2[i]));
            if (binary.length()<n){
                length = binary.length();
                for (int j=0; j<n-length; j++){
                    binary.insert(0, "0");
                }
            }
            sarr2[i] = String.valueOf(binary);
        }

        for (int i=0; i<sarr1.length; i++){
            sanswer = new StringBuilder();
            for (int j=0; j<sarr1[i].length(); j++){
                if (sarr1[i].charAt(j)=='1'||sarr2[i].charAt(j)=='1'){
                    sanswer.append("#");
                } else {
                    sanswer.append(" ");
                }
            }
            answer[i] = sanswer.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution65 solution65 = new Solution65();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(solution65.solution(n, arr1, arr2));
    }
}