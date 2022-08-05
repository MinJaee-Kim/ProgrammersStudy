package test;

public class randomMix {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] b = shuffle(a);

        for (int c : b) {
            builder.append(c).append(" ");
        }

        System.out.println(builder);
    }

    private static int[] shuffle(int[] numberList) {
        for (int i = 0; i < numberList.length; i++) {
            int a = (int) (Math.random() * numberList.length);

            int tmp = numberList[a];
            numberList[a] = numberList[i];
            numberList[i] = tmp;
        }

        return numberList;
    }
}