//푸드 파이터 대회
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++) {
            int count=food[i]/2;
            for(int j=1; j<=count; j++) {
                String str=String.valueOf(i);
                answer+=str;
            }
        }
        answer+="0";
        for(int i=food.length-1; i>=1; i--) {
            int count=food[i]/2;
            for(int j=1; j<=count; j++) {
                String str=String.valueOf(i);
                answer+=str;
            }
        }
        return answer;
    }
}