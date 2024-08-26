class Solution {
    public int solution(int slice, int n) {
        int result = 0;
        if(n%slice != 0){
            result = (int)(n+slice)/slice;
        }else{
            result = n/slice;
        }
        
        
        return result;
    }
}