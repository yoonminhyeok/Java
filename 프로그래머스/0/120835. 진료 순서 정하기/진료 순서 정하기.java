import java.util.*;
class Solution {  //진료순서 정하기 
    public int[] solution(int[] emergency) {
        int[] emergencyCopy = new int[emergency.length];
        int[] result=  new int[emergency.length];
        for(int i=0; i<emergency.length; i++)
            emergencyCopy[i]= emergency[i];
        
        Arrays.sort(emergencyCopy);
  
        
        
        return  emergencyCopy;
    }
}