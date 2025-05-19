class Solution { //공 던지기 
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for(int i=0; i<2*k; i+=2){
            answer=numbers[i%numbers.length];
        }
        return answer;
    }
}