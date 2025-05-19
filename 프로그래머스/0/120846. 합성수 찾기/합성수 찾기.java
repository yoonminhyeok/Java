class Solution {  //합성수 찾기 
    public int solution(int n) {
        int answer = 0;
        
        for(int i=3; i<=n; i++){
            int num=i;
            int numCount=0;
            for(int j= num; j>=1; j--){
                if(num%j==0)
                    numCount++;
            }
            if(numCount>=3)
                answer++;
        }
        return answer;
    }
}