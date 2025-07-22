// 덧칠하기 
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        boolean ing=true;
        int count=0;
        int num=section[0];
        int i=1;
        if(m==1)
            return section.length;
        else if(section[section.length-1]-section[0]<=m-1){
            return 1;
        }
        else {
            while(i<=section.length-1){
                if(section[i]-num <= m-1){
                    i++;
                    
                }
                else {
                    answer++;
                    num=section[i];
                    i++;
                }
                
            }
        }
        return answer;
    }
}
// - - - - -
// 1. 페인트가 칠해진 길이 n
// 2.  1미터 길이의 구역 n개로 나누고  1번부터 n까지 번호 붙임
//3. 페인트를 칠하는 롤러으 ㅣ길이 m(벽에서 벗어나면안댐, 구역의 일부분만 포함되도록 칠하면안댐)

