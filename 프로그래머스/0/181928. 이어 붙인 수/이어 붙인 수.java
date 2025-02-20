class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String tmpOdd="";
        String tmpEven="";
        for(int i=0; i<num_list.length; i++)
        {
            if(num_list[i]%2!=0)
            {
                tmpOdd+=num_list[i]+"";
            }
            else
            {
                tmpEven+=num_list[i]+"";
            }
          
        }
        answer=Integer.parseInt(tmpOdd)+Integer.parseInt(tmpEven);
        return answer;
        
    }
}