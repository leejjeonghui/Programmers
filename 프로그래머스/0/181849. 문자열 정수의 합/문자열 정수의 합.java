class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int sum=0;
        for(int i =0 ; i<num_str.length() ; i++){
            sum += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        System.out.println(sum);
        return sum;
    }
}