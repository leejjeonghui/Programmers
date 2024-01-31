import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList <Integer> result = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] == 2){
                arrayList.add(i);
            }
        }
        if(!arrayList.isEmpty()) {
            int k = arrayList.get(arrayList.size() - 1);
            for (int j = arrayList.get(0); j < k + 1; j++) {
                result.add(arr[j]);
            }
        }else result.add(-1);
        
        return result;
    }
}