class Solution { //유한소수 판별하기
    public int solution(int a, int b) {
        int answer = 2;
        
        if(a%b==0)
            return 1;

        for(int i=2; i<=a; i++){
            while(true){
                if(a%i==0 && b%i==0){
                    a/=i;
                    b/=i;
                }
                else
                    break;
            }
            
        }
        System.out.println(a);
        System.out.println(b);
//         if(b%2==0 || b%5==0)
//             answer=1;
        
        while(b%2==0 || b%5==0){
            if(b%2==0 && b%5==0){
                b/=10;
            }
            else if(b%2==0 && b%5!=0){
                b/=2;
            }
              else if(b%2!=0 && b%5==0){
                b/=5;
            }
        }
        if(b==1 || b==2 || b==5)
            answer=1;
        return answer;
    }
}
