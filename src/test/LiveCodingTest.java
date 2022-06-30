package test;

public class LiveCodingTest {
    public boolean solution() {
        int[] test = {1, 2, 3, 4, 5};
        int temp;

        for (int i=0; i< test.length; i++){
            for (int j=i; j< test.length; j++) {
                if (test[j]>test[i]){
                    temp = test[i];
                    test[i] = test[j];
                    test[j] = temp;
                }
            }
        }

        for (int j=0; j< test.length; j++) {
            System.out.println(test[j]);
        }
        return false;
    }

    public static void main(String[] args) {
        LiveCodingTest liveCodingTest = new LiveCodingTest();

        System.out.println(liveCodingTest.solution());
    }
}
