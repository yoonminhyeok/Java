package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        b=++a; //a의 값을 먼저 증가 시킨후 b에 대입

        System.out.println("a= "+a + " b= "+b);

        a=1;  //값 재할당
        b=0;  //값 재할당
        b=a++; //a의 값을 먼저 대입한후 a의값 증가

        System.out.println("a= "+a + " b= "+b);
    }
}
