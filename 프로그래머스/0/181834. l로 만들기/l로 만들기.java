class Solution {  //l로만들기 
    public String solution(String myString) {
        String answer = myString.replaceAll("[a-l]", "l");
        return answer;
    }
}