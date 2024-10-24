import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int before = 0;
        int next = 0;

        int arr[]= Arrays.copyOf(array,array.length+1);

        arr[arr.length-1] = n;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[0]==n){
                answer = arr[1];
                break;
            }
            else if(arr[i]==n&&i<arr.length-1){
                before = arr[i-1];
                next = arr[i+1];
                answer = (n-before)>(next-n)?next:before;
                break;
            }
            else if(arr[arr.length-1]==n){
                answer = arr[arr.length-2];
                break;
            }
        }

        return answer;
    }
}