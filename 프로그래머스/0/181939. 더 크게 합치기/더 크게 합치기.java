
class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        String aa= Integer.toString(a)+Integer.toString(b);
        String bb= Integer.toString(b)+Integer.toString(a);
        
        a=Integer.parseInt(aa);
        b=Integer.parseInt(bb);
        
        if(a>=b)
            answer=a;
        else
            answer=b;
        
        return answer;
        
    
    
   
    }
}