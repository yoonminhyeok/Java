class Solution { //k의 개수
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x=i; x<=j; x++){
            String str=String.valueOf(x);
            for(int y=0; y<str.length(); y++){
                if(str.charAt(y)-48==(char)k){
                     answer++;
                 }
            }
        }
        return answer;
    }
}

