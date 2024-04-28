import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String myStr) {
        String[] answer = myStr.split("[abc]");
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<answer.length;i++){
            if(!answer[i].equals("")){
                arr.add(answer[i]);
            }
        }
        if(arr.isEmpty()){
            arr.add("EMPTY");
        }
        return arr;
    }
}