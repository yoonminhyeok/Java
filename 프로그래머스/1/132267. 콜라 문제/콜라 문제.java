//콜라문제
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int emptyB=n;
        
        while(emptyB>=a) {
        int count=emptyB/a;
        int giv=count*a;
        emptyB-=giv;
        emptyB+=count*b;
        System.out.println(emptyB);
        answer+=count*b;
        }
        
        System.out.println(emptyB);
        return answer;
    }
}