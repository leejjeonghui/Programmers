import java.util.ArrayList;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
        int result =0;
        for(int i =0; i <my_string.length();i++){
            arr.add(my_string.substring(i,my_string.length()));
        }
        if(arr.contains(is_suffix)==true){
            result = 1;
        }else {
            result = 0;
        };
        return result;
    }
}