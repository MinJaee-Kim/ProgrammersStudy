package test;

import java.util.ArrayList;

public class SoulWareTest6 {
    public String solution(String[] s, String name) {
        ArrayList<String> arrayList = new ArrayList();
        int count = 1;

        for (int i=0; i<s.length; i++){
            arrayList.add(s[i]);
        }

        while (arrayList.contains(name)) {
            name = name.substring(0, name.indexOf("."))+"("+String.valueOf(count)+")"+name.substring(name.indexOf("."));
            count++;
        }

        return name;
    }

    public static void main(String[] args) {
        SoulWareTest6 soulWareTest6 = new SoulWareTest6();
        String[] s = {"20200309_최종.png",
                "20200309_최종_수정.png",
                "20200309_최종_수정(1).png",
                "20200309_최종_확정.png",
                "20200309_최종_확정2.png"
        };


        System.out.println(soulWareTest6.solution(s, "20200309_최종_수정(1).png"));
    }
}
