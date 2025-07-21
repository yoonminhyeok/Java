//데이터 분석
import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
      
        int varData=0;
        int index=-1;
        int count=0;
        int answerIndex=0;
        int sortIndex = -1;
        
        
        if(ext.equals("code")){
            varData=val_ext;
            index=0;
        }
        else if(ext.equals("date")){
            varData=val_ext;
            index=1;
        }
        else if(ext.equals("maximum")){
            varData=val_ext;
            index=2;
        }
        else if(ext.equals("remain")){
            varData=val_ext;
            index=3;
        }
        
        for(int i=0; i<data.length; i++){
            if(data[i][index]<varData){
                count++;
            }
        }
        int[][] answer = new int[count][4];
    
        
         for(int i=0; i<data.length; i++){
            if(data[i][index]<varData){
                for(int j=0; j<4; j++){
                    answer[answerIndex][j]=data[i][j];
                }
                answerIndex++;
            }
        }
        
        if(sort_by.equals("code")){
            sortIndex=0;
        }
        else if(sort_by.equals("date")){
            sortIndex=1;
        }
        else if(sort_by.equals("maximum")){
            sortIndex=2;
        }
        else if(sort_by.equals("remain")){
            sortIndex=3;
        }
        
        final int a=sortIndex;
        Arrays.sort(answer, Comparator.comparingInt((int [] o) -> o[a]));
        
        return answer;
        
        
    }
}

//1. 