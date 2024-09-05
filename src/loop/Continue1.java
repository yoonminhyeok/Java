package loop;

public class Continue1 {
    public static void main(String[] args) {

        int i=1;
        int sum=0;
        while(i<=5)
        {
            if(i==3) {
                i++;
                continue;
            }
            sum+=i;
            i++;
        }

        System.out.println(sum);
    }
}
