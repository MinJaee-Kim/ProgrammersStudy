package solved;

class kPrime {
    public int solution(int n, int k) {
        int answer = 0;
        int index = 0;
        String stackNumber = "";
        String convertNumber = Integer.toString(n, k);

        while(convertNumber.length()>index){
            if(Long.parseLong(String.valueOf(convertNumber.charAt(index)))>0) stackNumber+=convertNumber.charAt(index);
            else {
                if(!stackNumber.equals("")&&Long.valueOf(stackNumber)>1) answer+=isPrime(Long.valueOf(stackNumber))?1:0;
                stackNumber = "";
            }
            
            index++;
        }

        if(!stackNumber.equals("")&&Long.valueOf(stackNumber)>1) answer+=isPrime(Long.valueOf(stackNumber))?1:0;

        return answer;
    }

    private boolean isPrime(long num) {
        if(num == 1)  return false;
        long repeat = (long)Math.sqrt(num) + 1;
        for(int i=2;i<repeat;i++) {
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        kPrime k = new kPrime();

        System.out.println(k.solution(36, 3));
    }
}