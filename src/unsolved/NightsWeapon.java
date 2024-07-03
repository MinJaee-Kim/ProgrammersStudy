package unsolved;

class NightsWaepon {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] nights = new int[number];

        for(int i=1; i<=number; i++){
            nights[i-1] = findGCD(i);
        }
        for(int i=0; i<nights.length; i++){
            answer+=nights[i]>limit?nights[i]:power;
        }

        return answer;
    }

    private int findGCD(int number){
        int count = 0;
        for(int i=1; i<=Math.sqrt(number); i++){
            if(number%i==0) {
                count++;
                if (i!=number/i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NightsWaepon n = new NightsWaepon();

        System.out.println(n.solution(10, 3, 2));
    }
}