class Solution { //나이 출력
    public int solution(int age) {
        int answer = 0;
        if(age>=0 && age<=120)
        {
            answer=2022-age+1;
        }
        return answer;
    }
}