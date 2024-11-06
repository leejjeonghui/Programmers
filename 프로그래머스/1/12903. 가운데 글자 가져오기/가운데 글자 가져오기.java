class Solution {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        if(s.length()%2==0){
            answer.append(s.substring(s.length()/2-1,s.length()/2+1));
        }else {
           answer.append(s.charAt((s.length()-1)/2));
        }
        return answer.toString();
     }       
   }
