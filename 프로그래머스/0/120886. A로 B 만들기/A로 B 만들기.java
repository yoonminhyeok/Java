import java.util.*; //A로 B만들기
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String arrBefore[]=before.split("");
        String arrAfter[]=after.split("");
        
        Arrays.sort(arrBefore);
        Arrays.sort(arrAfter);
        
        if(Arrays.equals(arrBefore,arrAfter))
            answer=1;
        
        return answer;
    }
}