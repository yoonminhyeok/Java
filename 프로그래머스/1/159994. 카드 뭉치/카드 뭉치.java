//카드뭉치
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index1=0;
        int index2=0;
        
        for(int i=0; i<goal.length; i++) {
            if(index1<cards1.length &&cards1[index1].equals(goal[i]))
                index1++;
            else if(index2<cards2.length && cards2[index2].equals(goal[i]))
                index2++;
            else
                return "No";
        }
        return answer;
    }
}

// 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.(재사용 x)
// 카드를 사용하지 않고 다음카드로 넘어갈수 x
// 기존에 주어진 카드 뭉치의 순서 변경 x

