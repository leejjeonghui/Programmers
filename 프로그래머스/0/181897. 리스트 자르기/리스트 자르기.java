import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        if(n==1){
            for(int i=0;i<slicer[1]+1;i++){
                answer.add(num_list[i]);
            }
        }
        if(n==2){
            for(int j=slicer[0];j<num_list.length;j++){
                answer.add(num_list[j]);
            }
        }
        if(n==3){
            for(int k = slicer[0];k<slicer[1]+1;k++){
                answer.add(num_list[k]);
            }
        }if(n==4) {
            for(int l =slicer[0];l<slicer[1]+1; l+=slicer[2]){
                answer.add(num_list[l]);
            }
        }
        return answer;
    }
}