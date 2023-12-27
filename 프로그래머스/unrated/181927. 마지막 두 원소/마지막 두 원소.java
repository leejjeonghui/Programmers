class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int []arr = new int[num_list.length+1];
        int lastIdx = num_list.length-1;
        if(num_list[lastIdx]>num_list[lastIdx-1]) {
           for(int i = 0;i< num_list.length;i++){
               arr[i] = num_list[i];
           }
           arr[lastIdx+1] = num_list[lastIdx]-num_list[lastIdx-1];
           answer = arr;


        }else {
            for(int i =0 ; i<num_list.length;i++){
                arr[i] = num_list[i];
            }
            arr[lastIdx+1] = num_list[lastIdx]*2;
            answer =arr;
        }
        return answer;
    }
}