class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i=2;i>=0;i--){
            if(date1[i]<date2[i]){
                answer = 1;
            } else if (date1[i]>date2[i]){
                answer = 0;
            }
        }
        return answer;
    }
}