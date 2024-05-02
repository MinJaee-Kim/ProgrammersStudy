package solved;

import java.util.Arrays;

public class NumberCard {
    public int solution(int[] arrayA, int[] arrayB) {
        int max = 0;
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        int minA = arrayA[0];
        int minB = arrayB[0];

        max = getMax(arrayA, arrayB, max, minA);
        max = getMax(arrayB, arrayA, max, minB);


        return max;
    }

    private int getMax(int[] arrayA, int[] arrayB, int max, int minA) {
        while (minA>1){
            boolean isDivisible = false;
            for (int a: arrayA){
                if (a%minA==0){
                    if (arrayA[arrayA.length-1]==a) isDivisible = true;
                }else{
                    break;
                }
            }

            if (isDivisible){
                for (int b: arrayB){
                    if(b%minA==0){
                        break;
                    } else {
                        if (arrayB[arrayB.length-1]==b) {
                            if(minA>max) max = minA;
                        };
                    }
                }
            }

            minA--;
        }
        return max;
    }

    public static void main(String[] args) {
        NumberCard numberCard = new NumberCard();
        int[] arrayA = { 10, 20 };
        int[] arrayB = { 5, 17 };

        System.out.println(numberCard.solution(arrayA, arrayB));
    }
}
