class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i =0; i<myString.length(); i++){
            if((int)myString.charAt(i)<(int)'l'){
                myString = myString.replace(myString.charAt(i),'l');
            }
        }
        return myString;
    }
}