class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[my_string.length()/m];
        int index = c - 1;
        for (int i=0; i<chars.length; i++) {
            sb.append(my_string.charAt(index));
            index += m;
        }
        return sb.toString();
    }
}