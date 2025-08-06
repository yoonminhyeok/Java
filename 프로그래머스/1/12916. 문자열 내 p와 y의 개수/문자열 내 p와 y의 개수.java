class Solution {
    boolean solution(String s) {
        boolean answer = true;
    
        String str= s.toUpperCase();
        int pCount=0;
        int yCount=0;
        
        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='P')
                pCount++;
            else if(ch=='Y')
                yCount++;
        }
        
        if(pCount!=yCount)
            answer=false;
        
        return answer;
    }
}