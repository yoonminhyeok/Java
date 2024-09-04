package cond;

public class If5 {
    public static void main(String[] args) {

        int price=15000;
        int age=10;

        if(price>=10000)
        {
            price-=1000;
        }

        if(age<=10)
        {
            price-=1000;
        }

        System.out.println("총 결제 금액은 "+price+ " 원 입니다");
    }
}
