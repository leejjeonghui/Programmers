import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0; i<intervals.length;i++){
            int n = intervals[i][0];
            int j = intervals[i][1];
            for(int k = n; k<j+1; k++){
                arrayList.add(arr[k]);
            }
        }
        return arrayList;
    }
}