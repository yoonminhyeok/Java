class Solution { //문자 반복 출력하기 
    public String solution(String my_string, int n) {
        String answer = "";
        String arr[]= my_string.split("");
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<n; j++){
                answer+=arr[i];
            }
        }
        
        return answer;
    }
}