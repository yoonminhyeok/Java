class Solution { //삼각형의 완성조건(1)
    public int solution(int[] sides) {
        int answer = 0;
        int maxIndex=0;
        int sum=0;
        for(int i=1; i<sides.length; i++){
            if(sides[i]>sides[maxIndex]){
                maxIndex=i;
            }
        }
        for(int i=0; i<sides.length; i++){
            if(i!=maxIndex){
                sum+=sides[i];
            }
        }
        if(sum>sides[maxIndex])
            answer= 1;
        else
            answer =2;
        return answer;
    }
}