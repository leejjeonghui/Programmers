class Solution {
   public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < phone_number.length()-4; i++) {
            answer.append("*");
            idx++;
        }
        for (int i = 0; i <4 ; i++) {
            answer.append(phone_number.charAt(idx));
            idx++;
        }
        return answer.toString();
    }
}