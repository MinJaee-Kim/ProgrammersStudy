package unsolved;

import java.util.HashSet;

class Solution97 {
    public int solution(String dirs) {
        int answer = 0;
        int x=0;
        int y=0;
        HashSet<Location> hashSet = new HashSet();

        for (int i=0; i<dirs.length(); i++){
            if (dirs.charAt(i)=='U'){
                y++;
                hashSet.add(new Location(x, y));
            }else if (dirs.charAt(i)=='L'){
                x--;
                hashSet.add(new Location(x, y));
            }else if (dirs.charAt(i)=='R'){
                x++;
                hashSet.add(new Location(x, y));
            }else if (dirs.charAt(i)=='D'){
                y--;
                hashSet.add(new Location(x, y));
            }
        }


        return answer;
    }

    private class Location {
        int x;
        int y;
        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private boolean equals(Object obj) {
            if (obj instanceof Location){
                Location temp = (Location) obj;
                return x == 
            }
        }

        private int getX() {
            return x;
        }
        private int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        Solution97 solution97 = new Solution97();

        System.out.println(solution97.solution("ULURRDLLU"));
    }
}