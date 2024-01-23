import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        int[] answer = {};
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList();
        for(char i=65; i<91;i++){
            char finalI = i;
            arr.add((int) my_string.chars().filter(c ->c== finalI).count());
        }
        for(char j = 97; j<123;j++){
            char finalJ = j;
            arr.add((int) my_string.chars().filter(c->c==finalJ).count());

        }
        System.out.println(arr.size());
        return arr;
    }
}