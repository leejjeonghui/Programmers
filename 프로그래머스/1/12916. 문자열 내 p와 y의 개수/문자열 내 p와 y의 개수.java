class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt_p =0;
        int cnt_s =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
              cnt_p++;  
            } else if (s.charAt(i)=='y'||s.charAt(i)=='Y') {
                cnt_s++;
            }
        }
        if(cnt_p!=cnt_s){
            answer=false;
        }
        return answer;
    }
}