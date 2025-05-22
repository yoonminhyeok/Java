class Solution { //피자 나눠 먹기(2)
    public int solution(int n) {
        int answer = 1;
        int piece=6;
        
        while(true){
         
            if(piece%n==0){
                break;
            }
            piece+=6;
            answer+=1;
        }
       
        return answer;
    }
}