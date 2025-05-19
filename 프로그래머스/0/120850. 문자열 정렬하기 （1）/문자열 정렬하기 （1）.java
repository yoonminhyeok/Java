import java.util.*;
class Solution { //문자열 정렬하(1)
    public  List <Integer> solution(String my_string) {
        List <Integer> answer = new ArrayList<Integer>();
        
        String arr[]=my_string.split("[^0-9]");
        
        for(int i=0; i<arr.length; i++)
        {
            if(!arr[i].equals("")){
                for(int j=0; j<arr[i].length(); j++){
                    char ch=arr[i].charAt(j);
                    answer.add(ch-48);
                    
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}