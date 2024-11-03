class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int val =0;
        for(int i=1;i<k;i++){
            val+=2;
        }
        if(val>numbers.length){
            answer = numbers[val%numbers.length];
        }else{
            answer = numbers[val];
        }
        return answer;
    }
}