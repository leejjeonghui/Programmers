class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int len = included.length;
        int n = 1;
        int an = 0;
        for (int i=0; i <len;i++){
            an = a+(n-1)*d;
            n++;
            if(included[i]==true) {
            answer = answer+an;
            }
        }
        System.out.println(answer);
        return answer;
    }
    //{true, false, false, true, true}
}