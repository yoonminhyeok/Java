// 이웃한 칸
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int y=h;
        int x=w;
        int maxY=board.length-1;
        int maxX=board[0].length-1;
        
         if((h==0 && w==0) && (maxX==0 && maxY==0))
            return 0;
        
        if(y==0){
            if(x==0)
            {   
               
                if(board[y][x].equals(board[y+1][x]))
                    answer++;
                if(board[y][x].equals(board[y][x+1]))
                    answer++;
            }
            else if(x==maxX){
                if(board[y][x].equals(board[y+1][x]))
                    answer++;
                 if(board[y][x].equals(board[y][x-1]))
                    answer++;
            }
            else{
                 if(board[y][x].equals(board[y+1][x]))
                    answer++;
                 if(board[y][x].equals(board[y][x-1]))
                    answer++;
                 if(board[y][x].equals(board[y][x+1]))
                    answer++;
            }
        }
        else if(y==maxY){
             if(x==0)
            {
                if(board[y][x].equals(board[y-1][x]))
                    answer++;
                if(board[y][x].equals(board[y][x+1]))
                    answer++;
            }
            else if(x==maxX){
                if(board[y][x].equals(board[y-1][x]))
                    answer++;
                 if(board[y][x].equals(board[y][x-1]))
                    answer++;
            }
            else{
                 if(board[y][x].equals(board[y-1][x]))
                    answer++;
                 if(board[y][x].equals(board[y][x-1]))
                    answer++;
                 if(board[y][x].equals(board[y][x+1]))
                    answer++;
            }
        }
        else{
            if(x==0)
            {
                if(board[y][x].equals(board[y+1][x]))
                    answer++;
                if(board[y][x].equals(board[y][x+1]))
                    answer++;
                 if(board[y][x].equals(board[y-1][x]))
                    answer++;
            }
             else if(x==maxX){
                if(board[y][x].equals(board[y-1][x]))
                    answer++;
                 if(board[y][x].equals(board[y][x-1]))
                    answer++;
                  if(board[y][x].equals(board[y+1][x]))
                    answer++;
            }
            else{
                 if(board[y][x].equals(board[y+1][x]))
                    answer++;
                   if(board[y][x].equals(board[y-1][x]))
                    answer++;
                 if(board[y][x].equals(board[y][x+1]))
                    answer++;
                 if(board[y][x].equals(board[y][x-1]))
                    answer++;
            }
        }
    
        return answer;
    }
}

//1.  2차원 격자 보드판 있음
//2. 그 중 한 칸을 골랐을때  좌, 우, 상, 하 같은 색으로 칠해진 칸의 갯수
//3. boar [][]   --> 각 칸에 칠해진 색깔 이름이 담김
//4. h,w,는 위치