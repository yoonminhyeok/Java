//달리기 경주
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> rankMap = new HashMap<>();
        for(int i=0; i<players.length; i++){
            rankMap.put(players[i],i);
        }
        
        for(String called : callings) {
            int idx= rankMap.get(called);
            
            if(idx >0){
                String player= players[idx-1];
                
                players[idx-1]=called;
                players[idx]=player;
                
                rankMap.put(called, idx-1);
                rankMap.put(player, idx);
            }
        }
        
        return players;
    }
}