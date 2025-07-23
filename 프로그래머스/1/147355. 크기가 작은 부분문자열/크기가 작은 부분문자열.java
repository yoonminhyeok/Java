//크기가 작은 부분 문자열
import java.math.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String tmp="";
     
        BigInteger pNum= new BigInteger(p);
       
       int length= t.length()-p.length();
        for(int i=0; i<=length; i++) {
            tmp="";
            for(int j=i; j<i+p.length(); j++)
            {
             char ch= t.charAt(j);
             tmp+=String.valueOf(ch);
            }
            BigInteger tNum= new BigInteger(tmp);
            if(tNum.compareTo(pNum)<=0)
                answer++;
            System.out.println(tmp);
        }
    
        return answer;
    }
}