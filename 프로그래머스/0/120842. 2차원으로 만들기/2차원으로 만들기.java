class Solution { //2차원으로 만들기 
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int num_listCount=0;
        int answerCount=0;
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<n; j++){
                answer[i][j]=num_list[num_listCount];
                if(num_list.length-1 != num_listCount)
                    num_listCount++;
            }
        }
        return answer;
    }
}