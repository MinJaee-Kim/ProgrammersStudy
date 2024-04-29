package test;

class TossTest {
    public int solution(int[] levels) {
        for (int i = 0; i < levels.length; i++) {
            if((double) i/(double) levels.length>=0.75) return levels[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        TossTest test = new TossTest();
        int[] levels = {1, 2, 3, 4};

        System.out.println(test.solution(levels));
    }
}
