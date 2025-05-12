import java.util.*; //문자열 계산하기
class Solution { 
    public int solution(String my_string) {
        int answer = 0;
        
        String arr[]= my_string.trim().split("\\s");
        answer=Integer.parseInt(arr[0]);
        
        for(int i=1; i<arr.length; i++){
             if(arr[i].equals("+"))
             {
                 answer+=Integer.parseInt(arr[i+1]);
             }
             else if(arr[i].equals("-")){
                 answer-=Integer.parseInt(arr[i+1]);
             }   
             
        }
        return answer;
    }
}