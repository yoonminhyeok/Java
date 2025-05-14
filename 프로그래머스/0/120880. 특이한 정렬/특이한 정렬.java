class Solution {  //특이한 정렬
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int minIndex=0;
        int tmp;
        for(int i=0; i<answer.length; i++){
            minIndex=i;
            for(int j=i+1; j<answer.length; j++){
                if(Math.abs(numlist[j]-n) <Math.abs(numlist[minIndex]-n)){
                    minIndex=j;
                }   
                else if(Math.abs(numlist[j]-n) ==Math.abs(numlist[minIndex]-n)) {
                    if(numlist[j]>numlist[minIndex])
                        minIndex=j;
                }  
            }
            answer[i]=numlist[minIndex];
            tmp=numlist[i];
            numlist[i]=numlist[minIndex];
            numlist[minIndex]=tmp;
        }
        return answer;
    }
}