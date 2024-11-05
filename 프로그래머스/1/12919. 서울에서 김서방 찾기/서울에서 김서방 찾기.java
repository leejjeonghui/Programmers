class Solution {
     public String solution(String[] seoul) {
        String answer = "";
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                return func(i);
            }
        }
        return answer;
    }
    
    public String func(int j){
       String str = "김서방은 "+j+"에 있다";
       return str;
    }
}