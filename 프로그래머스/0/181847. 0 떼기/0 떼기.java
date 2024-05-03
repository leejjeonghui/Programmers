class Solution {
    public StringBuilder solution(String n_str) {
        String answer = "";
        StringBuilder sb = new StringBuilder(n_str);

        int j = 0;
        while (true){
            if(sb.charAt(j)=='0'){
                sb.deleteCharAt(j);
            }if(sb.charAt(j)!='0'){
                break;
            }
        }

        return sb;
    }
}