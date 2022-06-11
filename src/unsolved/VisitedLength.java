package unsolved;

import java.util.HashSet;

class Solution97 {
    public int solution(String dirs) {
        int x=0;
        int y=0;
        HashSet<Location> hashSet = new HashSet();

        for (int i=0; i<dirs.length(); i++){
            if (dirs.charAt(i)=='U'&&y<6){
                y++;
                hashSet.add(new Location(x, y, x, y-1));
            }else if (dirs.charAt(i)=='L'&&x>-5){
                x--;
                hashSet.add(new Location(x, y, x+1, y));
            }else if (dirs.charAt(i)=='R'&&x<6){
                x++;
                hashSet.add(new Location(x, y, x-1, y));
            }else if (dirs.charAt(i)=='D'&&y>-5){
                y--;
                hashSet.add(new Location(x, y, x, y+1));
            }
        }

        return hashSet.size();
    }

    private class Location {
        int x;
        int y;
        int preX;
        int preY;
        Location(int x, int y, int preX, int preY) {
            this.x = x;
            this.y = y;
            this.preX = preX;
            this.preY = preY;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(x);
        }

        @Override
        public boolean equals(Object obj) {
            Location l = (Location) obj;
            if (this.x==l.preX&&l.x==this.preX) {
                return true;
            } else if (this.y==l.preY&&l.y==this.preY) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution97 solution97 = new Solution97();

        System.out.println(solution97.solution("UDUDDU"));
    }
}