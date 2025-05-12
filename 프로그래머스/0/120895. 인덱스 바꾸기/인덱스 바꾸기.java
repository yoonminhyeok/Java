class Solution { //인덱스 바꾸기
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char tmp= my_string.charAt(num1);
        String s= Character.toString(tmp);
        
        for(int i=0; i<my_string.length(); i++){
            if(i==num1){
                answer+=Character.toString(my_string.charAt(num2));
            }
            else if(i==num2){
                answer+=s;
            }
            else{
                answer+=Character.toString(my_string.charAt(i));
            }
        }
        return answer;
    }
}