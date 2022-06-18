package solved;

import java.util.*;

class Solution105 {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        File[] files2 = new File[files.length];

        int numStart = 0;
        int numEnd = 0;

        for (int i=0; i<files.length; i++){
            for (int j=0; j<files[i].length(); j++){
                if (files[i].charAt(j)>=48&&files[i].charAt(j)<=57){
                    if (numStart<=0)
                        numStart = j;
                } else if (numStart>0) {
                    numEnd = j;
                    break;
                }
                if (j==files[i].length()-1){
                    numEnd = j+1;
                }
            }
            files2[i] = new File(files[i].substring(0, numStart), files[i].substring(numStart, numEnd), files[i].substring(numEnd));
            numStart = 0;
            numEnd = 0;
        }

        Arrays.sort(files2);

        for (int i=0; i<files2.length; i++){
            answer[i] = files2[i].name+files2[i].num+files2[i].tale;
            System.out.println(answer[i]);
        }


        return answer;
    }

    class File implements Comparable<File> {
        String name;
        String num;
        String tale;
        File (String name, String num, String tale) {
            this.name = name;
            this.num = num;
            this.tale = tale;
        }

        @Override
        public int compareTo(File o) {
            int res = this.name.toLowerCase().compareTo(o.name.toLowerCase());
            if (res==0)
                res = Integer.parseInt(this.num) - Integer.parseInt(o.num);
            return res;
        }
    }

    public static void main(String[] args) {
        Solution105 solution105 = new Solution105();
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] files2 = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        String[] files3 = {"img000012345", "img1.png","img2","IMG02"};

        System.out.println(solution105.solution(files3));
    }
}