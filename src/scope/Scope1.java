package scope;

public class Scope1 {
    public static void main(String[] args) {

        int m=10;
        if(true)
        {
            int x=10; // x생성
            System.out.println("if m: "+m);
            System.out.println("if x: "+x);
        } // if문이 끝날때 x 소멸
    }
}
