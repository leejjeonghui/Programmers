class Solution {
    public long solution(int balls, int share) {
      
        if (share > balls - share) {
            share = balls - share;  
        }

        long result = 1;
        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }

        return result;
    }
}
