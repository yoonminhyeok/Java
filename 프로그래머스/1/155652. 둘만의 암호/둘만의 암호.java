// 둘만의 암호
import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<String> list= new ArrayList<>();
 
        String str="";
        for(char c: skip.toCharArray()) {
            list.add(String.valueOf(c));
        }
        System.out.println(list);
        
        for(char c: s.toCharArray()) {
            char ch= c;
            int moved=0;
            
            while(moved< index) {
                ch= (char)(((ch-'a'+1)%26)+'a');
                str= String.valueOf(ch);
                
                if(list.contains(str))
                    continue;
                moved++;           
            }
            answer+=str;
            
        }
        return answer;
    }
}