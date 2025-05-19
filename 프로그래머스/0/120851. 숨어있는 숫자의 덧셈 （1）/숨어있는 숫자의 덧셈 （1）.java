class Solution { //숨어있는 숫자의 덧셈(1)
    public int solution(String my_string) {
        int answer = 0;
        
        String arr[]=my_string.split("[^0-9]");
        
        for(int i=0; i<arr.length; i++)
        {
            if(!arr[i].equals("")){
                for(int j=0; j<arr[i].length(); j++){
                    char ch=arr[i].charAt(j);
                    answer+=ch-48;
                }
            }
        }        
        return answer;
    }
}