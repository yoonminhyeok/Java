package ex;

public class CurrencyExchangeEx {
    public static void main(String[] args) {

        int dollar=3;
        int won=0;

        if(dollar <0)
        {
            System.out.println("잘못된 금액입니다");
        }
        else if (dollar ==0)
        {
            System.out.println("환전할 금액이 없습니다");
        }
        else
        {
            won=dollar*1300;
            System.out.println("환전 금액은 " +won+ " 입니다");
        }

    }
}
