class Solution { //진료순서 정하기 
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int max=-1;
        for(int i=0; i<emergency.length; i++){
            int maxIndex= i;
            for(int j=0; j<emergency.length; j++){
                if(emergency[j]>emergency[maxIndex])
                {
                    maxIndex=j;
                }
            }
            answer[maxIndex]=i+1;
            emergency[maxIndex]=0;
        }
        return answer;
    }
}