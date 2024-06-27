package unsolved;

class ColaProblem {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int store = 0;

        while (a<=n) {
            answer += (n/a)*b;
            store += n%a;

            n = n/a+store;
            store = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        ColaProblem c = new ColaProblem();

        System.out.println(c.solution(8, 1, 20));
    }
}