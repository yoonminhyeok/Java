//바탕화면 정리
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int count=0;
        int minX=0;
        int maxX=0;
        int minY=0;
        int maxY=0;
        int comparCount=0;
        
        String arr[][]= new String[wallpaper.length][wallpaper[0].length()];
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++) {
                arr[i][j]= String.valueOf(wallpaper[i].charAt(j));
                if(arr[i][j].equals("#"))
                    count++;
            }
        }
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++) {
                 if(arr[i][j].equals("#")){
                     if(comparCount==0){
                         minY=i;
                         minX=j;
                         maxY=i;
                         maxX=j;
                         
                         comparCount++;
                     }
                     else{
                         if(i<minY)
                             minY=i;
                         if(i>maxY)
                             maxY=i;
                         if(j<minX)
                             minX=j;
                         if(j>maxX)
                             maxX=j;
                         
                         comparCount++;
                     }
                        
                 }
                    
            }
        }
        answer[0]=minY;
        answer[1]=minX;
        answer[2]=maxY+1;
        answer[3]=maxX+1;
        
        return answer;
    }
}

// .#...
// ..#..
// ...#.