class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i =1 ; i<numLog.length;i++){
            if(numLog[i-1]==numLog[i]-1){
                answer += "w";
            }
            if(numLog[i-1]==numLog[i]+1){
                answer += "s";
            }
            if(numLog[i-1]==numLog[i]-10){
                answer += "d";
            }
            if(numLog[i-1]==numLog[i]+10){
                answer += "a";
            }
        }
        System.out.println(answer);
        return answer;
    }
}