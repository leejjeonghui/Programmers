import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] result = myString.split("x",-1);
        for(int i=0;i<result.length;i++){
            arrayList.add(result[i].length());
        }
        return arrayList;
    }
}