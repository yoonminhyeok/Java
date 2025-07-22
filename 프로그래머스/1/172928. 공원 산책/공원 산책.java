//공원산책 
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String parkArr[][]= new String[park.length][park[0].length()];
        
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[i].length(); j++){
                char ch=park[i].charAt(j);
                if(ch=='S')
                {
                    answer[0]=i;
                    answer[1]=j;
                }
                parkArr[i][j]=String.valueOf(ch);
            } 
        }
        
        for(int i=0; i<routes.length; i++){
           char dir= routes[i].charAt(0);
           int move = routes[i].charAt(2)-'0';
           int count=0;
           int y=answer[0];
           int x= answer[1];
        
           boolean canMove=true;
           if(dir=='E'){
                 if (x + move >= park[0].length()) continue;
                for (int j=1; j<=move; j++) {
                    if (parkArr[y][x+j].equals("X")) {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) answer[1] += move;
           } 
           else if(dir== 'W'){
               if(x - move < 0) continue;
               for(int j=1; j<=move; j++ ){
                  if (parkArr[y][x-j].equals("X")) {
                        canMove = false;
                        break;
                    } 
               }
               if (canMove) answer[1] -= move;
           }
           else if(dir== 'S') {
               if (y + move >= park.length) continue;
               for (int j=1; j<=move; j++) {
                    if (parkArr[y+j][x].equals("X")) {
                        canMove = false;
                        break;
                    }
                }
                 if (canMove) answer[0] += move;
           }
           else {
                if (y - move < 0) continue;
               for (int j=1; j<=move; j++) {
                    if (parkArr[y-j][x].equals("X")) {
                        canMove = false;
                        break;
                    }
                }
                if (canMove) answer[0] -= move;
           }
        }
        
        
        return answer;
    }
}
