class Solution { //순서 쌍의 갯수
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                answer++;
        }
        return answer;
    }
}