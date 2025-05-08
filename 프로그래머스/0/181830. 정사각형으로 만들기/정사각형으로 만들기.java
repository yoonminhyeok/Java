class Solution {  //정사각형으로 만들기 
    public int[][] solution(int[][] arr) {
        
        int n=arr.length;
        int m=arr[0].length;
        int max=0;
        if(n>m)
            max=n;
        else
            max=m;
        
        int [][] answer = new int[max][max];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                answer[i][j]=arr[i][j];
            }
        }
        return answer;
    }
}