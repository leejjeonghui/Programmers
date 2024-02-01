import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = n-1; i<num_list.length;i++){
            arrayList.add(num_list[i]);
        }
        System.out.println(arrayList);
        return arrayList;
    }
}