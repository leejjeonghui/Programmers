class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for(int i=num_list.length-1; i>=0;i--){
            if(num_list[i]<0){
                answer = i;
            }
        }
        System.out.println(answer);
        return answer;
    }
}