class Solution { //펙토리얼 
    public int solution(int n) {
        int answer = 0;
        
        int i=1;
        while(true){
            int fact=i;
            int facVal=1;
            for(int j=1; j<=i; j++){
                facVal*=j;
            }
            if(facVal<n)
            {
                i++;
            }
            else if(facVal==n){
                answer=i;
                break;
            }
            else{
                answer=i-1;
                break;
            }
        }
        return answer;
    }
}