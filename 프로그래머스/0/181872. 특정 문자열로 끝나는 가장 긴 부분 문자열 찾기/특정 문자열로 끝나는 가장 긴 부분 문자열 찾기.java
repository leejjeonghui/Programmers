class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i = myString.length()-1; i >= 0;i--){
            if(myString.charAt(i)==pat.charAt(pat.length()-1))
            {
                myString = myString.substring(0,i+1);
                break;
            }
        }
        return myString;
    }
}
