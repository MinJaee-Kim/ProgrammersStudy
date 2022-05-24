package solved;

class Solution62 {
    public int[] solution(int[] arr) {
        int count = 0;
        int low = 99999;
        for (int i=0; i< arr.length; i++){
            low = Math.min(low, arr[i]);
        }
        for (int i=0; i< arr.length; i++){
            if (low==arr[i]){
                count++;
            }
        }
        int[] answer = new int[arr.length-count];
        int index = 0;
        for (int i=0; i< arr.length; i++) {
            if (low!=arr[i]) {
                answer[index] = arr[i];
                index++;
            }
        }

        if (arr.length-1==0){
            answer = new int[]{-1};
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution62 solution62 = new Solution62();
        int[] arr = {4,3,2,1,1,1,4};

        System.out.println(solution62.solution(arr));
    }
}