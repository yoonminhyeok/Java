class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s= String.valueOf(x);
        int sum=0;
       
        for(int i=0; i<s.length(); i++) {
               char ch=s.charAt(i);
               sum+=ch-'0';
        }   
        if(x%sum==0)
            answer= true;
        else
            answer= false;
        System.out.println(sum);
        return answer;
    }
}