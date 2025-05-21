class Solution { //옷가게 할인 받기
    public int solution(int price) {
        double answer=0;
        
        if(price >=300000){
            if(price >=500000)
                answer=price*0.8;
            else
                answer=price*0.9;
        }
        else if(price>=100000)
            answer=price*0.95;
        else if(price<100000)
            answer=price;

        int result= (int)answer;

        return result;
    }
}