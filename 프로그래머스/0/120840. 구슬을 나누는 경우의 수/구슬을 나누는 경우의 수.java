import java.math.BigInteger;  //구슬을 나누는 경우의 수 
class Solution { //구슬을 나누는 경우의 수 
    public BigInteger solution(int balls, int share) {
        long answer = 0;
        
        BigInteger nFac= BigInteger.ONE;
        BigInteger minFac= BigInteger.ONE;
        BigInteger mFac= BigInteger.ONE;
      
        
        for(int i=balls; i>=2; i--){
            nFac= nFac.multiply(BigInteger.valueOf(i));
        }
        for(int i=balls-share; i>=2; i--){
            minFac=minFac.multiply(BigInteger.valueOf(i));
        }
        for(int i=share; i>=2; i--){
            mFac= mFac.multiply(BigInteger.valueOf(i));
        }
        
        return nFac.divide(mFac.multiply(minFac));
    }
}