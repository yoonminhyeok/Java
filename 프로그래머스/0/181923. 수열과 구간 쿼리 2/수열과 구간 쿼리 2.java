class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
         int count=0;
        
        for(int query[]: queries)
        {
            int s=query[0];
            int e=query[1];
            int k=query[2];
            int min= -99;
            int minIndex=-99;
           
            for(int j=s; j<=e; j++)
            {   
                if(arr[j]>k && min<0)
                {
                    minIndex=j;
                    min=arr[j];
                   
                }
                else if(arr[j]>k && arr[j]<min)
                {
                    minIndex=j;
                    min=arr[j];
                }
                
               
            }
            if(minIndex==-99)
                {    
                    answer[count]=-1;
                    count++;
                }
            else
                { 
                    answer[count]=min;
                    count++;
                }
        }
        return answer;
    }
}