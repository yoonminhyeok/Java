class Solution { //외계행성의 나이
    public String solution(int age) {
        String answer = String.valueOf(age);
        String result="";
        for(int i=0; i<answer.length(); i++){
            char ch=answer.charAt(i);
            
            int a= (int)ch+49;
            char c=(char)a;
            result+=Character.toString(c);
        }
        return result;
    }
}
