//가장 가까운 같은 글자
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        int alpha[]= new int[26];
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            int index=(int)(ch-'a');
            if(alpha[index]==0){
                answer[i]=-1;
                alpha[index]=-1;
            }
            else{
                for(int j=i-1; j>=0; j--){
                    char ch2=s.charAt(j);
                    if(ch==ch2){
                        answer[i]=i-j;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}