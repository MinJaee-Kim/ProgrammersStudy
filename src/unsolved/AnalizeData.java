package unsolved;

class AnalizeData {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        AnalizeData analizeData = new AnalizeData();
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};

        System.out.println(analizeData.solution(data, "date", 20300501, "remain"));
    }
}