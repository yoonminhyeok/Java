class Solution { //피자 나눠먹기
    public int solution(int n) {
        int answer = 1;
        int piece = 7;
        while(true){
            
            if(answer*piece>=n)
                break;
            
            answer++;
        }
        
        return answer;
    }
}