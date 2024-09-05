package ex;

public class OddNumEx {
    public static void main(String[] args) {

        int value=3;
        value= (value%2==0)?0:1;
        if(value==0)
        {
            System.out.println("짝수입니다");
        }
        else
        {
            System.out.println("홀수입니다");
        }
    }
}
