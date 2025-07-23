class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0; // x 문자 개수
        int diff = 0; // x가 아닌 문자 개수
        char x = s.charAt(0); // 기준 문자

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 기준 문자 정하기
            if (same == 0) {
                x = c;
            }

            if (c == x) {
                same++;
            } else {
                diff++;
            }

            if (same == diff) {
                answer++;
                same = 0;
                diff = 0;
            }
        }

        // 마지막 그룹이 남아있는 경우
        if (same != 0 || diff != 0) {
            answer++;
        }

        return answer;
    }
}
