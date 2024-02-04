class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<myString.length();i++){
            if(myString.charAt(i)=='A'){
              sb.append("B");
            }else if (myString.charAt(i)=='B'){
               sb.append("A");
            }
        }
        myString = sb.toString();
        if(myString.contains(pat)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}