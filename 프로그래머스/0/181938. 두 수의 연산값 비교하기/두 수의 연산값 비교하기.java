class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String tmp=Integer.toString(a)+Integer.toString(b);
        if(a*b*2>Integer.parseInt(tmp))
        {
            return a*b*2;
        }
        else
        {
            return Integer.parseInt(tmp);
        }
        
    }
}