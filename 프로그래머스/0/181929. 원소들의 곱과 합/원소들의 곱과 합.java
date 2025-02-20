class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum2=0;
        int mul=1;
        for(int i=0; i<num_list.length; i++)
        {
            mul*=num_list[i];
            sum2+=num_list[i];
            
            
        }
        sum2=sum2*sum2;
        if(mul<sum2)
            answer=1;
        else if(mul>sum2)
            answer=0;
        return answer;
    }
}