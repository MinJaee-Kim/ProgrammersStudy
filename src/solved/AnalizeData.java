package solved;

import java.util.Arrays;
import java.util.Comparator;

class AnalizeData {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] filterArray = Arrays.stream(data)
        .filter(a->ext.equals("code") ? a[0]<val_ext : ext.equals("date") ? a[1]<val_ext : ext.equals("maximum") ? 
        a[2]<val_ext : a[3]<val_ext).map(o->(int[]) o).toArray(int[][]::new);

        Arrays.sort(filterArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (sort_by.equals("code")) {
                    return Integer.compare(o1[0], o2[0]);
                } else if (sort_by.equals("date")) {
                    return Integer.compare(o1[1], o2[1]);
                } else if (sort_by.equals("maximum")) {
                    return Integer.compare(o1[2], o2[2]);
                } else {
                    return Integer.compare(o1[3], o2[3]);
                }
            }
        });

        return filterArray;
    }

    public static void main(String[] args) {
        AnalizeData analizeData = new AnalizeData();
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};

        System.out.println(analizeData.solution(data, "date", 20300501, "remain"));
    }
}