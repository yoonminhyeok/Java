//삼총사
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int count=1;
        int sum=0;
        int index=0;
        for(int i=0; i<=number.length-3; i++) {
            for(int j=i+1; j<=number.length-2; j++) {
                for(int k=j+1; k<=number.length-1; k++) {
                    if(number[i]+number[j]+number[k]==0)
                        answer++;
                }
            }
         }
        return answer;
    }
}