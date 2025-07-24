//명예의 전당
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int tie[]= new int[k];
        for(int i=0; i<tie.length; i++){
            tie[i]=2001;
        }
        //  0 0 0
        for(int i=0; i<score.length; i++){
            if(i<k){
               tie[i]=score[i];
               Arrays.sort(tie);
               answer[i]=tie[0];
            }
            else {
                Arrays.sort(tie);
                if(score[i]>tie[0]){
                    System.out.println(i);
                    tie[0]=score[i];
                    Arrays.sort(tie);
                    answer[i]=tie[0];
                    
                }
                else {
                    answer[i]=tie[0];
                }
            }
        }
        System.out.println(tie[0]);
        System.out.println(tie[1]);
        System.out.println(tie[2]);
        
        return answer;
    }
}