class Solution {
    public int solution(String binomial) {

        int answer = 0;
        for(int i = 0; i<binomial.length();i++) {
            if (binomial.charAt(i) == '-' ) {
             answer = Integer.parseInt(binomial.substring(0,i).trim())-Integer.parseInt(binomial.substring(i+1,binomial.length()).trim());
            }else if( binomial.charAt(i) == '+'){
                answer = Integer.parseInt(binomial.substring(0,i).trim())+Integer.parseInt(binomial.substring(i+1,binomial.length()).trim());
            }
            else if(binomial.charAt(i) == '/'){
                answer = Integer.parseInt(binomial.substring(0,i).trim())/Integer.parseInt(binomial.substring(i+1,binomial.length()).trim());
            }
            else if(binomial.charAt(i) == '*'){
                answer = Integer.parseInt(binomial.substring(0,i).trim())*Integer.parseInt(binomial.substring(i+1,binomial.length()).trim());
            }

        }
        System.out.println(answer);
        return answer;
    }
}