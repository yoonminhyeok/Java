class Solution { //치킨 쿠폰
    public int solution(int chicken) {
        
        int serviceCoupon=0;
        
        while(chicken>=10){
            serviceCoupon+=chicken/10;
            chicken=chicken/10+chicken%10;
        }
        return serviceCoupon;
    }
}