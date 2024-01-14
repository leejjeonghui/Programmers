import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0;i<intStrs.length;i++){
           String str= intStrs[i].substring(s,l+s);
           if(Integer.parseInt(str)>k){
             arr.add(Integer.parseInt(str));
           }
        }
        System.out.println((arr));
        return arr;

    }
}
