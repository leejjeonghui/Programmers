class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i<my_string.length();i++){
            if(my_string.charAt(i)==alp.charAt(0)){
             my_string = my_string.replace(alp,alp.toUpperCase());
            }
        }
        System.out.println(my_string);
        return my_string;
    }
}