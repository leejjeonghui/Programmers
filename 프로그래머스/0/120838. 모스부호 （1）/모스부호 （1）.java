import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer ="";
        String[] letters = letter.split(" ");
        String[] morse =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Character> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i],(char)(i+97));
        }
        
        for(int j =0; j< letters.length; j++){
            answer+=map.get(letters[j]);
        }
        return answer;
    }
}