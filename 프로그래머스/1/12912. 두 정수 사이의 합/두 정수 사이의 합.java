class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max=0; int min=0;
        if(a>b){
            max=a;
            min=b;
        }
        else
        {
            max=b;
            min=a;
        }
        for(long i=min; i<=max; i++)
        {
            answer+=i;
        }
        return answer;
    }
}