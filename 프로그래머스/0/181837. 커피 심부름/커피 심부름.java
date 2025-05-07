class Solution { //커피 심부름
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length; i++){
            if(order[i].equals("anything") || order[i].contains("americano")){
                answer+=4500;
            }
            else{
                answer+=5000;
            }
        }
        return answer;
    }
}