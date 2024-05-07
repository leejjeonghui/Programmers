import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int ame = 4500;
        int lat = 5000;
        String[] americano = {"iceamericano","americanoice","hotamericano","americanohot","americano","anything"};
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i=0; i<americano.length;i++){
            arrayList.add(americano[i]);
        }

        for (int i =0; i<order.length; i++){
          if(arrayList.contains(order[i])){
              answer+=ame;
          } else{
              answer+=lat;
          }
        }
        return answer;
    }
}