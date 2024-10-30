class Solution {
    public int solution(int[] sides) {
        int answer = 0; // count
        int min = sides[0]<sides[1]?sides[0]:sides[1];
        int max= sides[0]>sides[1]?sides[0]:sides[1];


        for (int i = max-min; i < max; i++) {
            answer++;
        }
    
        for (int j = max+1 ; j<(min+max); j++){
            answer ++;
        }
        return answer;
    }
}