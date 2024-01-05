import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        while (n!=1){
            if(n%2==0){
                n= n/2;
            }else{
                n= 3*n+1;
            }
            arr.add(n);

        }

        System.out.println(arr);
        return arr;
    }
}