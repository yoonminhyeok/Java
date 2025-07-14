import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        Arrays.sort(mats);  // 2 3 5

        
        for(int i=0; i<mats.length; i++){
            for(int j=i+1; j<mats.length; j++){
                if(mats[j]>mats[i]){
                    int tmp=mats[j];
                    mats[j]=mats[i];
                    mats[i]=tmp;
                }
            }
        }
        
       
        
        for(int m:mats){
            for(int i=0; i<=park.length-m; i++){
                for(int j=0; j<=park[i].length-m; j++){
                    boolean flag=true;
                    
                    if(park[i][j].equals("-1")){
                        for(int k=0; k<m; k++){
                            for(int l=0; l<m; l++){
                                if(!park[i+k][j+l].equals("-1")){
                                    flag=false;
                                    break;
                                }
                            }
                            if (!flag) break;
                        }
                        if (flag) return m;
                    }
                }
            }
        }
        return answer;
    }
}