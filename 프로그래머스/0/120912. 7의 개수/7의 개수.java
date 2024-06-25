class Solution {
 public int solution(int[] array) {
        int answer = 0;
        for(int i : array){
            if(Integer.toString(i).contains("7")){
                for(int j=0; j<Integer.toString(i).length(); j++){
                    if(Integer.toString(i).charAt(j)=='7'){
                        answer++;
                    }

                }
            }
        }
        return answer;
    }

}