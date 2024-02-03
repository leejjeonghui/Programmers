class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='a'){
                myString = myString.replace('a','A');
            }
        }
        return myString;
    }
}