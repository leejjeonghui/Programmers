
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i< arr.length;i++){
            if(flag[i]==true){
                for(int j =0;j<arr[i]*2;j++){
                arrayList.add(arr[i]);
                }
            }else if (flag[i]==false){
                for(int k =0;k<arr[i];k++)
            arrayList.remove(arrayList.size()-1);
            }
        }
        return arrayList;
    }
}