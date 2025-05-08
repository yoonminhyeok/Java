class Solution {  //특별한 이차원 배열2
    public int solution(int[][] arr) {
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==arr[j][i]){
                   answer++;
                }
                else
                    return 0;
            }
        }
        return 1;
    }
}
