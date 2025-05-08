class Solution { //다음에 올 숫자
    public int solution(int[] common) {
        int answer = 0;
        
        int k=0;
        
        int x1=common[0];
        int x2=common[1];
        int x3=common[2];
        
        if(x2-x1== x3-x2){
            k=x2-x1;
            answer=common[common.length-1]+k;
        }
        else{
            k=x2/x1;
            answer=common[common.length-1]*k;
        }
        return answer;
    }
}