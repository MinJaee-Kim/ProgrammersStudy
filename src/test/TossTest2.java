package test;

class TossTest2 {
    public int solution(String s) {
        int beforeNumber = 0;
        int index = 0;
        int count = 0;
        int max = -1;

        while (index<s.length()){
            if(beforeNumber==Integer.parseInt(String.valueOf(s.charAt(index)))) count++;
            else count = 1;

            if(count==3) {
                if((Integer.parseInt(String.valueOf(s.charAt(index))) * 111)>max) max = Integer.parseInt(String.valueOf(s.charAt(index))) * 111;
            };
            beforeNumber = Integer.parseInt(String.valueOf(s.charAt(index)));
            index++;
        }

        return max;
        //정답
    }

    public static void main(String[] args) {
        TossTest2 test = new TossTest2();
        String s = "111333999";

        System.out.println(test.solution(s));
    }
}
