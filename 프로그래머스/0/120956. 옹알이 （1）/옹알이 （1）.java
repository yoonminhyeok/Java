class Solution { //옹알이(1)
    public int solution(String[] babbling) {
        
        String arr[]=  {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<arr.length; j++){
                babbling[i]=babbling[i].replace(arr[j]," ");
            }
            if(babbling[i].trim().length()==0){
                answer++;
            }
        }
        return answer;
    }
}