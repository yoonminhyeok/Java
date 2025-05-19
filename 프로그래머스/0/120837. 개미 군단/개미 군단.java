class Solution { //개미 군단
    public int solution(int hp) {
        int answer = 0;
        
        while(hp>0){
            if(hp>=5){
                hp-=5;
                answer++;
            }
            else if(hp>=3 && hp<5){
                hp-=3;
                answer++;
            }
            else if(hp>0 && hp<3){
                hp-=1;
                answer++;
            }
        }
        return answer;
    }
}