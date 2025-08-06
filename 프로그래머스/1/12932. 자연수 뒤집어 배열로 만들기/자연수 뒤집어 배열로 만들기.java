class Solution {
    public int[] solution(long n) {
        
        
        String s= String.valueOf(n);
        int answer[] = new int[s.length()];
        int index=0;
        for(int i=s.length()-1; i>=0; i--){
            char ch=s.charAt(i);
            answer[index++]= ch-'0';
        }
        return answer;
    }
}