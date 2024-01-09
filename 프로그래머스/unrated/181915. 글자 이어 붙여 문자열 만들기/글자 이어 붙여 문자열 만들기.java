class Solution {
    public StringBuilder solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i<index_list.length;i++){
            answer.append(my_string.charAt(index_list[i]));
        }
        System.out.println(answer);
        return answer;
    }
}