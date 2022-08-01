package unsolved;

import java.util.ArrayList;

class Solution102 {
    ArrayList<ArrayList<String>> arrayList = new ArrayList();
    public int solution(String[][] relation) {
        for (int i=0; i< relation[0].length; i++){
            dfs(relation, new ArrayList(),0, 0, i);
        }

        return arrayList.size();
    }

    private void dfs(String[][] relation, ArrayList addAry, int depth, int n, int m) {
        ArrayList compAry = new ArrayList();
        if (n==m){
            return;
        } else if (depth==relation[0].length){
            return;
        }
        
        
        //일단 저장
        for (int i=0; i< relation.length; i++){
            addAry.add(relation[i][depth]);
        }

        if (addAry.size()>= relation.length*m){
            StringBuilder com = new StringBuilder();
            for (int i=0; i< relation.length; i++){
                for (int j=0; j< m; j++){
                    com.append(addAry.get(i+j* relation.length));
                    for (int k=0; k< arrayList.size(); k++) {
                        if (arrayList.get(k).contains(com.toString())){
                            addAry.clear();
                            dfs(relation, addAry, depth, n, m);
                            return;
                        }
                    }
                }

                if (!compAry.contains(com.toString())){
                    compAry.add(com.toString());
                }
                com.delete(0, com.length());
            }

            if (addAry.size()>=relation.length*m){
                addAry.clear();
            }
        }

        if (compAry.size()>=relation.length){
            arrayList.add(compAry);
        }


        dfs(relation, addAry,depth+1, n+1, m);
        dfs(relation, addAry,depth+1, n, m);
    }

    public static void main(String[] args) {
        Solution102 solution102 = new Solution102();
        String[][] relation =  {{"a","aa"},{"aa","a"},{"a","a"}};

        System.out.println(solution102.solution(relation));
    }
}