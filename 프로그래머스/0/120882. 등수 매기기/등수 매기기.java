class Solution { //등수 매기기
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] result= new int[score.length];
        
        for(int i=0; i<score.length; i++){
            answer[i]= score[i][0]+score[i][1];
        }
        
        for(int i=0; i<score.length; i++){
           int count=1;
           for(int j=0; j<score.length; j++){
               if(answer[j]>answer[i])
               {
                 count++;
               }
           }
           result[i]=count;
        }
        
        return result;
    }
}