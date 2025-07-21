//붕대감기
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxMin=0;
        int attackEquals=-1;
        int attackIndex=0;
        int bandCount=0;
        int maxHealth=health;
        for(int i=0; i<attacks.length; i++){
            maxMin=attacks[i][0];
        }
        
        
        for(int i=1; i<=maxMin; i++){
            attackEquals=-1;
            if(i==attacks[attackIndex][0])
            {   
                
                health-=attacks[attackIndex++][1];
                if(health<=0)
                    return -1;
                bandCount=0;
                
            }
           else{
                if(health+bandage[1]>=maxHealth){
                    bandCount++;
                    health=maxHealth;
                 }
                else{
                    health+=bandage[1];
                    bandCount++;
                }
                
                 if(bandCount==bandage[0]){
                        health+=bandage[2];
                        bandCount=0;
                        
                        if(health>maxHealth)
                            health=maxHealth;
                    }
            }
        }
        
        
        
        return health;
    }
} 