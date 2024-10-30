class Solution {
    public int solution(int[] sides) {
        int answer = 0; // count
        int min = sides[0]<sides[1]?sides[0]:sides[1];
        int max= sides[0]>sides[1]?sides[0]:sides[1];

        //가장 긴 변인 경우
        for (int i = max-min; i < max; i++) {
            answer++;
        }
        //나머지 한 변이 가장 긴 변인 경우
        for (int j = max+1 ; j<(min+max); j++){
            answer ++;
        }
        return answer;
    }
}