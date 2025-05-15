class Solution {  //겹치는 선분의 길이
    public int solution(int[][] lines) {
        int answer = 0;
        int arr[] = new int[201];
        
        for(int i=0; i<3; i++){
                int start =lines[i][0]+100;
                int end =lines[i][1]+100;
                for(int k=start; k<end; k++){
                    arr[k]+=1;
                }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=2)
                answer++;
        }
        return answer;
    }
}
