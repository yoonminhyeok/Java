import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i=0; i <targets.length; i++) {
            String target=targets[i];
            int sum = 0;

            for (int j=0; j<target.length(); j++) {
                char ch=target.charAt(j);
                int min=1000000;

                for (String key:keymap) {
                    int idx=key.indexOf(ch);
                    if (idx!=-1) {
                        min = Math.min(min, idx+1);  
                    }
                }
                if (min == 1000000) {
                    sum = -1; 
                    break;
                }
                sum+=min;
            }
            answer[i]=sum;
        }
        return answer;
    }
}
