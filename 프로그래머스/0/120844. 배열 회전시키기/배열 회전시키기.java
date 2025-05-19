class Solution { // 배열회전시키기
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int size=numbers.length;
        if(direction.equals("right")){
            answer[0]=numbers[size-1];
            for(int i=1; i<answer.length; i++){
                answer[i]=numbers[i-1];
                }
        }
        else if(direction.equals("left")){
            for(int i=0; i<answer.length-1; i++){
                answer[i]=numbers[i+1];
            }
            answer[answer.length-1]=numbers[0];
        }
        return answer;
    }
}