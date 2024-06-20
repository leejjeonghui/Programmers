import java.util.ArrayList;

 class Solution {
        public ArrayList solution(int[] arr, int[] delete_list) {
            ArrayList<Integer> list = new ArrayList();
            for(int a : arr){
                list.add(a);
            }
            for(int d:delete_list){
                list.remove(Integer.valueOf(d));
            }
            return list;
        }
    }