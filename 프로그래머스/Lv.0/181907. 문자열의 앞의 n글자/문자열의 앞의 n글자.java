class Solution {
    public StringBuilder solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i<n;i++){
            sb.append(my_string.charAt(i));
        }
        return sb;
    }
}