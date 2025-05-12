class Solution { //중복된 문자 제거
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            char ch=my_string.charAt(i);
            if(answer.indexOf(ch)>=0){
            }
            else
               answer+=my_string.charAt(i);
        }
        return answer;
    }
}