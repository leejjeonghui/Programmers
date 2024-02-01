import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = n ; i< num_list.length; i++){
            arrayList.add(num_list[i]);
        }
        for(int j = 0;j<n;j++){
            arrayList.add(num_list[j]);
        }
        System.out.println(arrayList);
        return arrayList;
    }
}