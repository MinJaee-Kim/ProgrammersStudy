package solved;

public class pAndyCount {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        for(String str : s.split("")) {
            if(str.equals("p")||str.equals("P")){
                pCount++;
            }else if(str.equals("y")||str.equals("Y")){
                yCount++;
            }
        }

        return pCount==yCount;
    }
    public static void main(String[] args) {
        pAndyCount obj = new pAndyCount();

        System.out.println(obj.solution("pyy"));
    }
}
