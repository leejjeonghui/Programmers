class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int x= board[0]/2;
        int y= board[1]/2;
        int i=0;
        while (i<keyinput.length){
            switch(keyinput[i]){
                case "up" :
                    if(answer[1]<y){
                        answer[1]++;
                    }
                    break;
                case "down" :
                    if(answer[1]>-y){
                        answer[1]--;
                    }
                     break;
                    
                case "left" :
                    if(answer[0]>-x){
                        answer[0]--;
                    }
                    break;
                    
                case "right" :
                    if(answer[0]<x){
                        answer[0]++;
                    }
                    break;
            }
            i++;
        }
        return answer;
    }
}