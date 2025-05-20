class Solution { //특정문자 제거하기
    public String solution(String my_string, String letter) {
        String answer = "";
        String arr[]= my_string.split("");
        
        for(int i=0; i<my_string.length(); i++){
            if(!arr[i].equals(letter))
                answer+=arr[i];
        }
        return answer;
    }
}