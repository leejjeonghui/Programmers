class Solution {
    public StringBuilder solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            int p1 = parts[i][0];
            int p2 = parts[i][1];
            String part = my_strings[i].substring(p1,p2+1);
            sb.append(part);
        }
        System.out.println(sb);
        return sb;
    }
}