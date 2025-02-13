class Solution {
    public String solution(String code) {
        String ret = "";
        int mode=0;
        
        for(int i=0; i<code.length(); i++)
        {
            
            char value=code.charAt(i);
            
            if(value=='1'&& mode==1)
            {
                mode=0;
                continue;
            }
            else if(value=='1' && mode==0)
            {
                mode=1;
                continue;
            }
           
            if(mode==0 && i%2==0)
            {
                ret+=value;
            
            }
            else if(mode==1 && i%2!=0)
            {
                ret+=value;
        
            }
        }
        
        if (ret.isEmpty())
            ret="EMPTY";
        
        return ret;
    }
}