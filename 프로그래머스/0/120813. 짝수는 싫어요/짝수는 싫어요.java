import java.util.*; //짝수는 싫어요 
class Solution { 
    public  List <Integer> solution(int n) {
        List <Integer> answer = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++){
            if(i%2!=0)
                answer.add(i);
        }
        return answer;
    }
}