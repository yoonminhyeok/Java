class Solution { //분수의 덧셈
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        while(true){
            if(denom1==denom2){
                answer[0]=numer1+numer2;
                answer[1]=denom2;
                if(answer[0]==answer[1])
                {
                    answer[0]=1;
                    answer[1]=1;
                }
                else if(answer[0] % answer[1]==0){
                    answer[0]=answer[0]/answer[1];
                    answer[1]=1;
                }
                break;
            }
            else if(denom1%denom2==0 || denom2%denom1==0){
                int max;
                int min;
                if(denom1>denom2){
                    answer[0]=numer1+numer2*(denom1/denom2);
                    answer[1]=denom1;
                    break;
                }
                else{
                     answer[0]=numer1*(denom2/denom1)+numer2;
                     answer[1]=denom2;
                     break;
                }
            }
            else{
                int numval= numer1*denom2 + numer2*denom1;
                denom2*=denom1;
              
                for(int i=numval; i>=2; i--){
                    if(numval%i==0 && denom2%i==0){
                        numval/=i;
                        denom2/=i;
                    }
                
                }
                answer[0]=numval;
                answer[1]=denom2;
                break;
            }
        }
        if(answer[1]%answer[0]==0)
        {
            int val=answer[0];
            answer[0]/=val;
            answer[1]/=val;
        }
        return answer;
    }
}