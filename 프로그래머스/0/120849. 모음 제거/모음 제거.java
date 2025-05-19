class Solution { //모음 제거
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            char ch=my_string.charAt(i);
            if(ch!='u' && ch!='a' &&  ch!='e' && ch!='i' && ch!='o'){
                answer+=Character.toString(ch);
            } 
        }
        return answer;
    }
}