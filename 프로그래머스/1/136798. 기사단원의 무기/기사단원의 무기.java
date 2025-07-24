//기사단원의 무기
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int index=0;
        int arr[]= new int[number];

        for(int i=1; i<=number; i++){
            for(int j=1; j*j<=i; j++) {
                if(i%j==0){
                    if(j*j==i)
                        arr[i-1]++;
                     else
                        arr[i-1]+=2;
                }
               
            }
        }
        
        for(int i=0; i<arr.length; i++){
           if(arr[i]<=limit) {
               answer+=arr[i];
           }
           else {
               answer+=power;
           }
        }
        
        return answer;
    }
}
//  number: 기사의 번호. 기사들은 무기점에서 무기 구매
// 기사는 자신의 기사 번호의 약수 갯수에 해당하는 공경력을 가진 무기 구매(공격력의 제한수치보다 큰 뮉 구매 x)
// 
