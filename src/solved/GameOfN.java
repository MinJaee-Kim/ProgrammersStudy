package solved;

class GameOfn {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int number = 0;
        int count = 1;

        while (t>answer.length()) {
            String now = Integer.toString(number, n);
            
            for(int i=0; i<now.length(); i++){
                if(count==p) answer+=now.charAt(i);
                if(count>=m) count = 0;
                count++;
                
                if(t<=answer.length()) break;
            }
            number++;
        }

        return answer.toUpperCase();
    }

    public static void main(String[] args) {
        GameOfn n = new GameOfn();

        System.out.println(n.solution(2, 4, 2, 1));
    }
}