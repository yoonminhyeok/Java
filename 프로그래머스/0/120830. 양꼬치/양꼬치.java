class Solution { //양꼬치 
    public int solution(int n, int k) {
        int answer = 0;
        
        answer= n*12000;
        int service=n/10;
        k-=service;
        
        if(k>0){
            answer+=k*2000;
        }
        
        return answer;
    }
}