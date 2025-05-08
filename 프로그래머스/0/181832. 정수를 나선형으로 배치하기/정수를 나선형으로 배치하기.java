class Solution {  //정수를 나선형으로 배치하기
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num=1;
        int rowStart=0;
        int colStart=0;
        int rowEnd=n-1;
        int colEnd=n-1;
        
        while(num<=n*n){
            
            for(int i=rowStart; i<=rowEnd; i++){
                answer[colStart][i]=num;
                num++;
            }
            colStart++;  
            
            for(int i=colStart; i<=colEnd; i++){
                answer[i][rowEnd]=num;
                num++;
            }
            rowEnd--;  
            
            for(int i=rowEnd; i>=rowStart; i--){
                answer[colEnd][i]=num;
                num++;
            }
            colEnd--;
            
            for(int i=colEnd; i>=colStart; i--){
                answer[i][rowStart]=num;
                num++;
            }
            rowStart++;
        }

        return answer;
    }
}