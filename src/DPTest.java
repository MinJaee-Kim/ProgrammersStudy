import java.util.Scanner;

public class DPTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int coin[] = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = scanner.nextInt();
        }

        int d[] = new int[k + 1];
        for (int i = 1; i <= k; i++) {
            d[i] = -1;
            for (int j = 0; j < n; j++) {
                if (coin[j] <= i) { //메모라이제이션으로 인한 같은값이 들어왔을때 한번 더 계산하지 않고 메모리에 있는 값을 재활용
                    if (d[i - coin[j]] < 0) continue;   //비교할수 없을때 비교하지 않음
                    if (d[i] < 0) d[i] = d[i - coin[j]] + 1;    //값 넣기
                    else if (d[i - coin[j]] + 1 < d[i]) d[i] = d[i - coin[j]] + 1;  //더 작은 값 넣기
                }
            }
        }

        System.out.println(d[1800]);
    }
}
