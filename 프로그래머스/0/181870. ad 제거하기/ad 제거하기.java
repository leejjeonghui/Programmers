import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> result= new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                result.add(strArr[i]);
            }
        }
        return result;
    }
}