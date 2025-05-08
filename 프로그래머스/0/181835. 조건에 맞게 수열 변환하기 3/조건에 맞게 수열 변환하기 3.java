class Solution { // 조건에 맞게 수열 변환하기 3
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<answer.length; i++){
            if(k%2!=0){
                answer[i]=arr[i]*k;
            }
            else{
                answer[i]=arr[i]+k;
            }
        }
        return answer;
    }
}