class Solution {  //뒤집힌 문자열 
    public String solution(String my_string) {
        String answer = "";
        String arr[]=my_string.split("");
        
        for(int i=arr.length-1; i>=0; i--){
            answer+=arr[i];
        }
        return answer;
    }
}