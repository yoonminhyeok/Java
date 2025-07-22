// 추억점수
import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> rankMap= new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            rankMap.put(name[i],yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++) {
                Integer val=rankMap.get(photo[i][j]);
                if(val !=null)
                    answer[i]+=val;
            }
        }
        return answer;
    }
}