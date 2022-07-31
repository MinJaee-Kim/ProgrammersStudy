package unsolved;

class Solution117 {
    public int solution(String dartResult) {
        int numCount = 0;
        int count = 0;
        int num = 0;
        int sum = 0;
        int total = 0;

        for (int i=0; i< dartResult.length(); i++){
            if (dartResult.charAt(i)>=48&&dartResult.charAt(i)<=57){
                numCount++;
            } else {
                if (numCount!=0) {
                    if (count>1){
                        total+=sum;
                        sum=num;
                        count=0;
                    } else {
                        sum=num;
                    }
                    num = Integer.parseInt(dartResult.substring(i - numCount, i));
                }
                if (dartResult.charAt(i)=='S'){
                    count++;
                } else if (dartResult.charAt(i)=='D') {
                    num = (int) Math.pow(num, 2);
                    count++;
                } else if (dartResult.charAt(i)=='T') {
                    num = (int) Math.pow(num, 3);
                    count++;
                } else if (dartResult.charAt(i)=='*') {
                    num*=2;
                    sum*=2;
                } else if (dartResult.charAt(i)=='#') {
                    num*=-1;
                }

                numCount = 0;
            }
        }

        sum += num;
        total+=sum;

        return total;
    }

    public static void main(String[] args) {
        Solution117 solution117 = new Solution117();

        System.out.println(solution117.solution("1D2S3T*"));
    }
}