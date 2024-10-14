class Solution {
    public int solution(String my_string) {
          int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char chr = my_string.charAt(i);

            if(Character.isDigit(chr)){
                 answer+=Integer.parseInt(String.valueOf(chr));
            }
        }
        return answer;
    }
}