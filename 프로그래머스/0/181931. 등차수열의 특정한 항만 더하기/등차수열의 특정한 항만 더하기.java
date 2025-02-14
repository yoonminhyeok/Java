class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int tmp=a;
        
        for(int i=0; i<included.length; i++)
        {
           if(i==0)
           {
                if(included[i]== true)
                    answer+=tmp;
           }
           else
           {
               tmp+=d;
               if(included[i]==true)
                   answer+=tmp;
           }
            
                
        }
        return answer;
    }
}