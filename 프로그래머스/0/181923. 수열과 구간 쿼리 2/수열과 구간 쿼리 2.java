class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i=0; i<queries.length; i++) {
            int startIdx = queries[i][0];
            int endIdx = queries[i][1];
            int targetNum = queries[i][2];
            
            int diff = -1; // minimum value
            for (int j=startIdx; j<=endIdx; j++) {
                if (arr[j] > targetNum && diff == -1) {
                    diff = arr[j];
                } else if (arr[j] > targetNum && arr[j] < diff) {
                    diff = arr[j];
                }
            }
            answer[i] = diff;
        }
        return answer;
    }
}