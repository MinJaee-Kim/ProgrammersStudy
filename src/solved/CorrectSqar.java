package solved;

class Solution48 {
    public long solution(int w, int h) {
        long answer = 1;
        long getGCD = (w>h)? getGCD(w, h):getGCD(h, w);
        answer = ((long) w*(long) h)-(w+h-getGCD);

        return answer;
    }

    private long getGCD(long x, long y) {
        if (x%y==0){
            return y;
        }else {
            return getGCD(y,x%y);
        }
    }

    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();

        System.out.println(solution48.solution(8, 12));
    }
}