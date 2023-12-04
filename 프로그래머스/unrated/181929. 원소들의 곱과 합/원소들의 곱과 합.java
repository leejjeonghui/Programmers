class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int s1 = num_list[0];
        int s2=num_list[0];
        for(int i =1; i<len; i++){
            s1 = s1 * num_list[i];
            s2 = s2 + num_list[i];
        }
        s2 = s2*s2;
        if (s1 <s2){
            answer = 1;
        }else {
            answer =0;
        }
        System.out.println(answer);
        return answer;
    }
}