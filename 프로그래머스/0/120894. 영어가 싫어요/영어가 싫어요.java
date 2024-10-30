import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < numArr.length; i++) {
            map.put(numArr[i],i);
        }

        for (int j = 0; j < numArr.length; j++) {
            if(numbers.contains(numArr[j])){
              numbers=numbers.replaceAll(numArr[j],String.valueOf(map.get(numArr[j])));
            }
        }       
        return Long.parseLong(numbers);
    }
}