class Solution { //피자 나눠먹기(3)
    public int solution(int slice, int n) {
        
        int answer = 1;
        int piece=slice;
        
        if(slice>=n)
            return 1;
        while(slice<n){   
            answer++;
            slice+=piece;
        }
        return answer;
    }
}