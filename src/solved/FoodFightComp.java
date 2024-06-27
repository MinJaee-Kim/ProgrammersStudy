package solved;

public class FoodFightComp {
    public String solution(int[] food) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                stringBuilder.append(i);
            }
        }
        String store = stringBuilder.toString();
        stringBuilder.append(0);

        for(int i=store.length()-1; i>=0; i--){
            stringBuilder.append(store.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        FoodFightComp f = new FoodFightComp();
        int[] food = {1, 3, 4, 6};

        System.out.println(f.solution(food));
    }
}
