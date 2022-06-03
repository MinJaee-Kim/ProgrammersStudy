package solved;


import java.util.Arrays;

class Solution41 {
    public int solution(int[] arr) {
        int GCD = 0;
        int LCM = 0;

        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){
            if (GCD == 0) {
                GCD = getGCD(arr[i + 1], arr[i]);
                LCM = arr[i + 1] * arr[i] / GCD;
                i++;
            } else {
                if (LCM>arr[i]) {
                    GCD = getGCD(LCM, arr[i]);
                } else {
                    GCD = getGCD(arr[i], LCM);
                }
                LCM = LCM*arr[i]/GCD;
            }

        }

        return LCM;
    }

    private int getGCD(int val1, int val2) {
        if (val1%val2==0){
            return val2;
        } else {
            return getGCD(val2, val1%val2);
        }
    }

    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();
        int[] arr = {5, 10, 15, 20, 25};

        System.out.println(solution41.solution(arr));
    }
}