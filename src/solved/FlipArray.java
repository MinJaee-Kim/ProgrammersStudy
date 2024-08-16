package solved;

class FlipArray {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=num_list.length-1; i>=0; i--){
            answer[i] = num_list[num_list.length-1-i];
        }
        return answer;
    }

    public static void main(String[] args) {
        FlipArray f = new FlipArray();
        int[] num_list = {1, 2, 3, 4, 5};


        System.out.println(f.solution(num_list));
    }
}